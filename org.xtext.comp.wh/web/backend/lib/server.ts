import * as express from "express";
import * as fs from "fs";
import * as path from "path";
import { spawn } from "cross-spawn";

import app from "./app";

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

    let filenameTS: string = "TS" + path.sep + basename + ".ts";
    let filenameJS: string = "TS" + path.sep + basename + ".js";
    let filenameCode3A: string = "Code3Adresse" + path.sep + basename + ".3ADDR";

    fs.writeFile(dirname + path.sep + filenameWhile, whileContent, (err: NodeJS.ErrnoException) => {
        if(err != null) {
            res.status(400).send();
            return;
        }
        let cmd = spawn('java', ["-jar", "WH.jar", filenameWhile, basename + ".ts"]);
        let str: string = ""
        
        cmd.stderr.on("data", (data) => {
            str += str.toString();
        } )
        cmd.stdout.on("data", (data) => {
            str += str.toString();
        } )



        cmd.on('close', () => {
            console.log(str)
            if(str !== "") {
                res.json({
                    error: str
                })
                return
            }
            fs.readFile(filenameTS, (err, data) => {
                if(err) {
                    throw err;
                };
                
                let outputTS:string = data.toString("utf-8")
                if(!outputTS.startsWith("import")) {
                    // Si ça ne commence pas par import alors il y a une erreur
                    res.json({
                        error: outputTS
                    })
                    return;
                }

                fs.readFile(filenameCode3A, (err, data) => {
                    let output3A: string = data.toString("utf-8")
                    compileTS(filenameTS);
                    res.json({
                        error: false,
                        filename: filenameJS,
                        TSCode: outputTS,
                        AddrCode: output3A,
                    });
                });
            })
        });
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