const spawn = require('cross-spawn')
const fs = require('fs')
const path = require('path')

async function execute(filename, ...args) {
    return new Promise(resolve => {
        let filenamePath = "TS"+path.sep+filename.slice(0, filename.length-3)+".ts";
        let tsNodePath = "node_modules" + path.sep + ".bin" + path.sep + "ts-node"
        let nodeCmd = spawn(tsNodePath, [filenamePath, ...args])
        let str = ""
        nodeCmd.stdout.on('data', (data) => {
            str+= data.toString()
        });
        nodeCmd.stderr.on('data', (data) => {
            str += data.toString()
        })
        nodeCmd.on("close", () => {
            let tab = str.split("\n")
            if(tab[0].startsWith("[")) {
                tab[1] = tab[1].replace('[ ', '[')
                tab[1] = tab[1].replace(' ]', ']')
                let res = tab[0].trim().substr(1, tab[0].trim().length-2).split(",").map(val => Number(val))
                let res1 = tab[1].trim().substr(1, tab[1].trim().length-2).split(",")
                resolve([res, res1])
            } else {
                resolve([str.trim()])
            }
        })
        
    })
}

module.exports = execute