import * as express from "express";
import * as fs from "fs";
import * as path from "path";
import { spawn } from "child_process";

import app from "./app";
import { compileFunction } from "vm";

const PORT = 8000;

app.listen(PORT, () => {
    console.log('Server listening on port ' + PORT);
})

function compileTS(filename: string) {
    spawn('tsc', [filename, "-m", "commonJS", "-t", "ES5"]);
}

app.post("/compile", function(req: express.Request, res: express.Response) {
    let whileContent: string = req.body.value;
    let dirname = path.dirname(__dirname);
    let basename = Date.now();
    let filenameWhile: string = "while" + path.sep + basename + ".wh";
    let filename: string = "TS" + path.sep + basename;

    fs.writeFile(dirname + path.sep + filenameWhile, whileContent, (err: NodeJS.ErrnoException) => {
        if(err != null) {
            res.status(400).send();
        } else {
            let cmd = spawn('./wh', [filenameWhile]);
            cmd.stdout.on( 'data', data => {
                let output:string = data.toString('utf-8');
                if(!output.startsWith("import")) {
                    // Si ça ne commence pas par import alors il y a une erreur
                    res.json({
                        error: true,
                        value: output,
                    })
                    return;
                }
                fs.writeFile(filename + ".ts", output, (err: NodeJS.ErrnoException) => {
                    if(err != null) {
                        res.status(400).send();
                    } else {
                        compileTS(filename + ".ts");
                        res.json({
                            error: false,
                            filename: filename + ".js",
                            value: output,
                        });
                    }
                })
            });
        }
    })
});

app.post("/execute", function(req: express.Request, res: express.Response) {
    let filename = req.body.filename;
    let args = req.body.args;
    let cmd = spawn('node', [filename, ...args]);
    let output = ""
    cmd.stdout.on('data', data => {
        output += data.toString("utf-8")
    });
    cmd.stderr.on("data", data => {
        output += data.toString("utf-8")
    })
    cmd.on('close', function(code) {
        res.json({
            value: output,
        })
    });
    
});