class BinTree {
    private _left: BinTree
    private _right: BinTree
    private _elem: string

    constructor(elem: string, left: BinTree, right: BinTree) {
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

    private static consArray(listTree: BinTree[]): BinTree {
        if (listTree !== null) {
            if (listTree.length===1){
                return listTree[0];
            }
            return new BinTree("", listTree[0], this.conslist(listTree.slice(1)));
        }
        return new BinTree("nil",null,null);
    }

    static not(tree: BinTree): BinTree {
        if (this.isTrue(tree)) {
            return new BinTree("nil", null, null);
        }
        return new BinTree("", new BinTree("nil", null, null), new BinTree("nil", null, null));
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
        for (var i: number = 0; i < list.length; i++) {
            res[i] = this.binTreeToNumber(list[i]);
        }
        return res;
    }

    private static binTreeToNumber(tree: BinTree): number {
        var counter: number = 0;
        if (tree !== null) {
            if (tree.elem === "") {
                counter++;
                counter += this.binTreeToNumber(tree.right)
            }
        }
        return counter;
    }

    static numberToBinTree(nb: number): BinTree {
        var res: BinTree = new BinTree("nil", null, null);
        for (var i: number = 0; i < nb; i++) {
            res = this.cons(res, new BinTree("nil", null, null));
        }
        return res;
    }

    static stringToBinTree(str: string): BinTree {
        /*
        3 situations : 
        -> str = (cons (cons A B) C...)
        -> str = (list A B C...)
        -> str = (nil)
        */

        // On vérifie la troisième situation
        if (str === "(nil)") {
            return new BinTree("nil", null, null);
        }

        // On crée un tableau pour chaque mots du string 
        var word: string[] = str.split(" ");

        // On déclare un tableau d'arguement
        var args: BinTree[];

        // On est dans la première situation
        if (word[0] === '(cons') {
            var i: number = 0;
            while (word[i] !== ")") {
                args[i] = new BinTree(word[i], null,null);
            }
            return this.consArray(args);
        }

        // On est dans la deuxième situation
        if (word[0] == '(list') {
            var i: number = 0;
            while (word[i] !== ")") {
                args[i] = new BinTree(word[i], null,null);
            }
            args[i+1]=new BinTree("nil",null,null);
            return this.consArray(args);
        }
    }

    static DisplayTree(tree: BinTree): string {
        if (tree.elem !== "") {
            return tree.elem
        }
        var res: string = "(Cons "
        res += this.DisplayTree(tree.left);
        res += ", "
        res += this.DisplayTree(tree.right)
        res += ")"

        return res
    }

    static isTrue(tree: BinTree): boolean {
        return tree.elem !== "nil";
    }

}