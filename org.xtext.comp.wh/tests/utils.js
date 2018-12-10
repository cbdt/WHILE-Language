const { spawn } = require('child_process')
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
            if(str.startsWith("[")) {
                let res = str.trim().substr(1, str.trim().length-2).split(",").map(val => Number(val))
                resolve(res)
            } else {
                resolve(str.trim())
            }
        })
        
    })
}

module.exports = execute