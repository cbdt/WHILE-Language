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

        let str = ""
        whileCmd.stdout.on('data', (data) => {
            str += data.toString()
        });

        whileCmd.stderr.on('data', (data) => {
            str += data.toString()
        });

        whileCmd.on("close", () => {
            if(!str.startsWith("import")) {
                signale.error(`Erreur lors de la compilation de ${whileFilename} ❌`);
                return;
            }
            fs.writeFile(tsFile, str, (err) => {
                if (err) throw err;
                signale.success(`${whileFilename} compilé ✅`);
                resolve();
            });
        })
        
    })
}

function readdirAsync(path) {
    return new Promise(function (resolve, reject) {
      fs.readdir(path, function (error, result) {
        if (error) {
          reject(error);
        } else {
          resolve(result);
        }
      });
    });
  }

async function readFiles() {
    process.stdout.write('\033c\033[3J');
    let files =  await readdirAsync(WHILE_DIR)
    signale.pending("Compilation des fichiers while");
    for (let i = 0; i < files.length; i++) {
        await compile(files[i])
    }
}
    
readFiles()