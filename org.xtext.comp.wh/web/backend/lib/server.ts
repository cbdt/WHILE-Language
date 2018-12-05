import * as express from "express";
import * as fs from "fs";
import * as path from "path";
import { spawn } from "child_process";

import app from "./app";

const PORT = 8000;

app.listen(PORT, () => {
    console.log('Express server listening on port ' + PORT);
})

app.post("/compile", function(req: express.Request, res: express.Response) {
    let whileContent: string = req.body.value;
    let dirname = path.dirname(__dirname);
    let fileName: string = "while" + path.sep + Date.now() + ".wh";
    fs.writeFile(dirname +path.sep+fileName, whileContent, (err: NodeJS.ErrnoException) => {
        if(err != null) {
            res.status(400);

        } else {
            let cmd = spawn('./wh', [fileName]);

            cmd.stdout.on( 'data', data => {
                let value:string = data.toString('utf-8')
                res.json({
                    "error": false,
                    "value": value
                })
            });
        }
    })

    
    /*
    cmd.on( 'close', code => {

    });*/

});



function generateUUID() { // Public Domain/MIT
    var d = new Date().getTime();
    if (typeof performance !== 'undefined' && typeof performance.now === 'function'){
        d += performance.now(); //use high-precision timer if available
    }
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
        var r = (d + Math.random() * 16) % 16 | 0;
        d = Math.floor(d / 16);
        return (c === 'x' ? r : (r & 0x3 | 0x8)).toString(16);
    });
}
