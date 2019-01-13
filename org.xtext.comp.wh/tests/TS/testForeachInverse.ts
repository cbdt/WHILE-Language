import BinTree from './BinTree'
var s0 = new BinTree("nil", null, null);
function main(args: string[]) {

    let nb_input: number = 1;
    if(args.length != nb_input) {
        console.error(`Le nombre d'argument n'est pas correct (${args.length} au lieu de ${nb_input})`); return;
    }
// TODO: Check if arg type is number or string
    let i0: number = Number(args[0]);

    let input0: BinTree;
    if(isNaN(i0)) {
        input0 = BinTree.stringToBinTree(args[0]);
    } else {
        input0 = BinTree.numberToBinTree(i0);
    }

    let outputs: BinTree[] = f0(input0);
    console.log(BinTree.binTreesToNumbers(outputs));
    console.log(BinTree.displayTrees(outputs));
}

function f0(Var1: BinTree) : BinTree[] {

    let Var2: BinTree = new BinTree("nil", null, null);
    let Var3: BinTree = new BinTree("nil", null, null);

    let TempVar0: BinTree;

    while(BinTree.isTrue(Var1)){
        Var2 = BinTree.hd(Var1);
        Var1 = BinTree.tl(Var1);
        TempVar0 = BinTree.cons(Var2, Var3);
        Var3 = TempVar0;
    }


    return [Var3];
}



main(process.argv.slice(2));