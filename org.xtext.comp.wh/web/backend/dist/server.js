"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const fs = require("fs");
const path = require("path");
const child_process_1 = require("child_process");
const app_1 = require("./app");
const PORT = 8000;
app_1.default.listen(PORT, () => {
    console.log('Express server listening on port ' + PORT);
});
app_1.default.post("/compile", function (req, res) {
    let whileContent = req.body.value;
    let dirname = path.dirname(__dirname);
    let fileName = "while" + path.sep + Date.now() + ".wh";
    fs.writeFile(dirname + path.sep + fileName, whileContent, (err) => {
        if (err != null) {
            res.status(400);
        }
        else {
            let cmd = child_process_1.spawn('./wh', [fileName]);
            cmd.stdout.on('data', data => {
                let value = data.toString('utf-8');
                res.json({
                    "error": false,
                    "value": value
                });
            });
        }
    });
    /*
    cmd.on( 'close', code => {

    });*/
});
function generateUUID() {
    var d = new Date().getTime();
    if (typeof performance !== 'undefined' && typeof performance.now === 'function') {
        d += performance.now(); //use high-precision timer if available
    }
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
        var r = (d + Math.random() * 16) % 16 | 0;
        d = Math.floor(d / 16);
        return (c === 'x' ? r : (r & 0x3 | 0x8)).toString(16);
    });
}
//# sourceMappingURL=server.js.map