import BinTree from './BinTree'
declare var s0: BinTree;

function main(args: any[]) {
    s0 = new BinTree("nil", null, null);

    let nb_input: number = 2;
    if(args.length != nb_input) {
        throw new Error(`Le nombre d'argument n'est pas correct (${args.length} au lieu de ${nb_input})`);
    }
// TODO: Check if arg type is number or string
    let i0: number = args[0];
    let i1: number = args[1];
    let input0: BinTree = BinTree.numberToBinTree(i0);
    let input1: BinTree = BinTree.numberToBinTree(i1);

    let outputs: BinTree[] = f0(input0, input1);
    console.log(BinTree.binTreesToNumbers(outputs));
}

function f0(Var1: BinTree, Var2: BinTree) : BinTree[] {

    let TempVar0: BinTree;
    let TempVar1: BinTree;
    let TempVar2: BinTree;

    TempVar0 = BinTree.cons(s0, s0);
    TempVar1 = BinTree.or(Var2, TempVar0)
    TempVar2 = BinTree.and(Var1, TempVar1);
    Var1 = TempVar2;

    return [Var1, Var2];
}