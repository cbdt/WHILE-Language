class BinTree {
    private _left: BinTree
    private _right: BinTree
    private _elem: string

    constructor(elem: string, right: BinTree, left: BinTree) {
        if (elem !== "nil") {
            this._left = left;
            this._right = right;
            this._elem = elem;
        }
        else {
            this._elem = elem;
            this._right = null;
            this._left = null;
        }
    }

    set elem(value: string) {
        this._elem = value;
    }

    get elem(): string {
        return this._elem;
    }

    set right(value: BinTree) {
        this._right = value;
    }

    get right(): BinTree {
        return this._right;
    }

    set left(value: BinTree) {
        this._left = value;
    }

    get left(): BinTree {
        return this._left;
    }

    static hd(tree: BinTree): BinTree {
        if (tree.elem !== "nil") {
            return tree.left;
        } else {
            return new BinTree("nil", null, null);
        }
    }

    static tl(tree: BinTree): BinTree {
        if (tree.elem !== "nil") {
            return tree.right;
        } else {
            return new BinTree("nil", null, null);
        }
    }

    static cons(firstTree: BinTree, secondTree: BinTree): BinTree {
        return new BinTree("", firstTree, secondTree);
    }

    static and(firstTree: BinTree, secondTree: BinTree): BinTree {
        if (firstTree.elem === "nil" || secondTree.elem === "nil") return new BinTree("nil", null, null)
        return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null))
    }

    static or(firstTree: BinTree, secondTree: BinTree): BinTree {
        if (firstTree.elem === "nil" && secondTree.elem === "nil") return new BinTree("nil", null, null)
        return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null))
    }

    static eq(firstTree: BinTree, secondTree: BinTree): BinTree {
        if (this.eqrec(firstTree, secondTree)) return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null))
        return new BinTree("nil", null, null)
    }

    private static eqrec(firstTree: BinTree, secondTree: BinTree): boolean {
        if (firstTree.left != null && secondTree.left == null) {
            return false;
        }
        if (firstTree.left == null && secondTree.left != null) {
            return false;
        }
        if (firstTree.right != null && secondTree.right == null) {
            return false;
        }
        if (firstTree.right == null && secondTree.right != null) {
            return false;
        }
        if (firstTree.right == null && secondTree.right == null && firstTree.left != null) {
            return firstTree.elem === secondTree.elem && this.eqrec(firstTree.left, secondTree.left);
        }
        if (firstTree.left == null && secondTree.left == null && firstTree.right != null) {
            return firstTree.elem === secondTree.elem && this.eqrec(firstTree.right, secondTree.right);
        }
        if (firstTree.left == null && firstTree.right == null) {
            return firstTree.elem === secondTree.elem;
        }
        if (firstTree.elem === secondTree.elem && this.eqrec(firstTree.left, secondTree.left) && this.eqrec(firstTree.right, secondTree.right)) {
            return true;
        }
        return false;
    }

    static binTreesToNumbers(list: BinTree[]): number[] {
        var res: number[];
        for(var i: number = 0; i<list.length; i++){
            res[i]=this.binTreeToNumber(list[i]);
        }
        return res;
    }

    private static binTreeToNumber(tree: BinTree): number {
        var counter: number = 0;
        if(tree !== null){
            if(tree.elem===""){
                counter++;
                counter+= this.binTreeToNumber(tree.right)
            }
        }
        return counter;
    }

    static numberToBinTree(nb: number): BinTree {
        var res: BinTree = new BinTree("nil",null,null);
        for(var i: number = 0; i<nb; i++){
            res = this.cons(new BinTree("nil",null,null), res);
        }
        return res;
    }

    static DisplayTree (tree: BinTree):string{
        if(tree.elem !== ""){
            return tree.elem
        }
        var res: string = "(Cons "
        res += this.DisplayTree(tree.left);
        res += ", "
        res += this.DisplayTree(tree.right)
        res += ")"

        return res
    }

}