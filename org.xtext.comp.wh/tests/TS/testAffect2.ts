import BinTree from './BinTree'
var s0 = new BinTree("nil", null, null);
function main(args: string[]) {

    let nb_input: number = 2;
    if(args.length != nb_input) {
        console.error(`Le nombre d'argument n'est pas correct (${args.length} au lieu de ${nb_input})`); return;
    }
// TODO: Check if arg type is number or string
    let i0: number = Number(args[0]);
    let i1: number = Number(args[1]);

    let input0: BinTree;
    if(isNaN(i0)) {
        input0 = BinTree.stringToBinTree(args[0]);
    } else {
        input0 = BinTree.numberToBinTree(i0);
    }

    let input1: BinTree;
    if(isNaN(i1)) {
        input1 = BinTree.stringToBinTree(args[1]);
    } else {
        input1 = BinTree.numberToBinTree(i1);
    }

    let outputs: BinTree[] = f0(input0, input1);
    console.log(BinTree.binTreesToNumbers(outputs));
}

function f0(Var1: BinTree, Var2: BinTree) : BinTree[] {

    let TempVar0;
    let TempVar1;

    TempVar0 = Var2;
    TempVar1 = Var1;
    Var1 = TempVar0;
    Var2 = TempVar1;

    return [Var1, Var2];
}

main(process.argv.slice(2));