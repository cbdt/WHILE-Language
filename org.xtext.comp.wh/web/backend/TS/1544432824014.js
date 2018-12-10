"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var BinTree_1 = require("./BinTree");
var s0 = new BinTree_1.default("nil", null, null);
function main(args) {
    var nb_input = 2;
    if (args.length != nb_input) {
        console.error("Le nombre d'argument n'est pas correct (" + args.length + " au lieu de " + nb_input + ")");
        return;
    }
    // TODO: Check if arg type is number or string
    var i0 = Number(args[0]);
    var i1 = Number(args[1]);
    var input0 = BinTree_1.default.numberToBinTree(i0);
    var input1 = BinTree_1.default.numberToBinTree(i1);
    var outputs = f0(input0, input1);
    console.log(BinTree_1.default.binTreesToNumbers(outputs));
}
function f0(Var1, Var2) {
    Var1 = s0;
    null;
    return [Var1, Var2];
}
main(process.argv.slice(2));
