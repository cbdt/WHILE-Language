const { spawn } = require('child_process')
const fs = require('fs')
const path = require('path')
const signale = require('signale');

const WHILE_DIR = "whileFiles";

async function compile(filename) {
    return new Promise(resolve => {
        let whileFilename =  WHILE_DIR + path.sep + filename 
        let baseFilename = filename.slice(0, filename.length-3);
        let tsFile = "TS"+path.sep+baseFilename+".ts"
        if(fs.existsSync(tsFile)) {
            signale.note(`Fichier ${filename} déjà compilé`)
            resolve()
            return
        } 

        let whileCmd = spawn('./wh', [whileFilename])
        whileCmd.stdout.on('data', (data) => {
            fs.writeFile(tsFile, data, (err) => {
                if (err) throw err;
                signale.success(`${whileFilename} compilé ✅`);
                resolve();
            });
        });
    })
}

fs.readdir(WHILE_DIR, async function(err, files) {
    process.stdout.write('\033c\033[3J');
    signale.pending("Compilation des fichiers while");
    const promises = files.map(compile)
    await Promise.all(promises)
});
