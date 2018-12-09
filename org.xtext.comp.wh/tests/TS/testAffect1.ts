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
    let input0: BinTree = BinTree.numberToBinTree(i0);
    let input1: BinTree = BinTree.numberToBinTree(i1);

    let outputs: BinTree[] = f0(input0, input1);
    console.log(BinTree.binTreesToNumbers(outputs));
}

function f0(Var1: BinTree, Var2: BinTree) : BinTree[] {

    Var1 = Var2;

    return [Var1];
}

main(process.argv.slice(2));
