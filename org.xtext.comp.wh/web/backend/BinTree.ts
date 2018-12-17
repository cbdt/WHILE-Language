export default class BinTree {
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
            if (listTree.length === 1) {
                return listTree[0];
            }
            return new BinTree("", listTree[0], this.consArray(listTree.slice(1)));
        }
        return new BinTree("nil", null, null);
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
        if (this.eqrec(firstTree, secondTree)) return new BinTree("", new BinTree("nil", null, null), new BinTree("nil", null, null))
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
        var res: number[] = [];
        for (var i: number = 0; i < list.length; i++) {
            res.push(this.binTreeToNumber(list[i]));
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
            res = this.cons(new BinTree("nil", null, null), res);
        }
        return res;
    }

    static stringToBinTree(str: string): BinTree {
        if (str === null) {
            return null;
        }

        // On crée un tableau pour chaque mots du string, qu'on coupe à chaque espace et parenthèse fermantes.
        let re = /\s+|\)/;
        var word: string[] = str.split(re);
        // console.log(word)
        return this.stringToBinTreeReq(word);
    }

    static stringToBinTreeReq(word: string[]): BinTree {
        switch (word[0]) {

            // La première entrée est "nil"
            case ("nil"): {
                return new BinTree("nil", null, null);

            }

            // La première entrée est "(cons"
            case ("(cons"): {
                // On déclare un tableau d'arguement
                let args: BinTree[] = [];

                // On parcours les arguements du cons
                var i: number = 1;
                while (word[i] !== '') {
                    // Si on tombe sur un cons ou un list à l'intérieur du cons
                    if (word[i] === "(cons" || word[i] === "(list") {
                        // console.log("On rentre dans la réc")
                        // On appelle récursivement la méthode en donnant la partie du tableau correspondante
                        args.push(this.stringToBinTreeReq(word.slice(i)));
                        // On fait évoluer notre curseur jusqu'à la prochaine parenthèse fermante +1, pour ne pas prendre deux fois les arguements
                        while (word[i] !== '') {
                            i++;
                        }
                        i++;
                    }
                    // Si on ne tombe pas sur un cons/list, on crée un bintree de l'élément correspondant 
                    else {
                        args.push(new BinTree(word[i], null, null));
                        i++;
                    }
                }
                return this.consArray(args);
            }

            // La première entrée est "(list"
            case ("(list"): {
                // console.log("I'm here")
                // On déclare un tableau d'arguement
                let args: BinTree[] = [];

                // On parcours les arguements du cons
                var i: number = 1;
                while (word[i] !== '') {
                    // Si on tombe sur un cons ou un list à l'intérieur du cons
                    if (word[i] === "(cons" || word[i] === "(list") {
                        // On appelle récursivement la méthode en donnant la partie du tableau correspondante
                        args.push(this.stringToBinTreeReq(word.slice(i)));
                        // On fait évoluer notre curseur jusqu'à la prochaine parenthèse fermante +1, pour ne pas prendre deux fois les arguements
                        while (word[i] !== '') {
                            i++;
                        }
                        i++;
                    }
                    // Si on ne tombe pas sur un cons/list, on crée un bintree de l'élément correspondant 
                    else {
                        args.push(new BinTree(word[i], null, null));
                        i++;
                    }
                }
                args.push(new BinTree("nil", null, null));
                return this.consArray(args);
            }

            // La première entrée est un symbole
            default: {
                return new BinTree(word[0], null, null);
            }
        }
    }

    static displayTree(tree: BinTree): string {
        if (tree.elem !== "") {
            return tree.elem
        }
        var res: string = "(Cons "
        res += this.displayTree(tree.left);
        res += ", "
        res += this.displayTree(tree.right)
        res += ")"

        return res
    }

    static displayTrees(trees: BinTree[]): string[] {
        let res: string[] = [];
        for (let tree of trees) {
            res.push(this.displayTree(tree))
        }

        return res
    }

    private static isTrue(tree: BinTree): boolean {
        return tree.elem !== "nil";
    }

}