"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var BinTree = /** @class */ (function () {
    function BinTree(elem, left, right) {
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
    Object.defineProperty(BinTree.prototype, "elem", {
        get: function () {
            return this._elem;
        },
        set: function (value) {
            this._elem = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BinTree.prototype, "right", {
        get: function () {
            return this._right;
        },
        set: function (value) {
            this._right = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BinTree.prototype, "left", {
        get: function () {
            return this._left;
        },
        set: function (value) {
            this._left = value;
        },
        enumerable: true,
        configurable: true
    });
    BinTree.hd = function (tree) {
        if (tree.elem !== "nil") {
            return tree.left;
        }
        else {
            return new BinTree("nil", null, null);
        }
    };
    BinTree.tl = function (tree) {
        if (tree.elem !== "nil") {
            return tree.right;
        }
        else {
            return new BinTree("nil", null, null);
        }
    };
    BinTree.cons = function (firstTree, secondTree) {
        return new BinTree("", firstTree, secondTree);
    };
    BinTree.consArray = function (listTree) {
        if (listTree !== null) {
            if (listTree.length === 1) {
                return listTree[0];
            }
            return new BinTree("", listTree[0], this.consArray(listTree.slice(1)));
        }
        return new BinTree("nil", null, null);
    };
    BinTree.not = function (tree) {
        if (this.isTrue(tree)) {
            return new BinTree("nil", null, null);
        }
        return new BinTree("", new BinTree("nil", null, null), new BinTree("nil", null, null));
    };
    BinTree.and = function (firstTree, secondTree) {
        if (firstTree.elem === "nil" || secondTree.elem === "nil")
            return new BinTree("nil", null, null);
        return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
    };
    BinTree.or = function (firstTree, secondTree) {
        if (firstTree.elem === "nil" && secondTree.elem === "nil")
            return new BinTree("nil", null, null);
        return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
    };
    BinTree.eq = function (firstTree, secondTree) {
        if (this.eqrec(firstTree, secondTree))
            return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
        return new BinTree("nil", null, null);
    };
    BinTree.eqrec = function (firstTree, secondTree) {
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
    };
    BinTree.binTreesToNumbers = function (list) {
        var res = [];
        for (var i = 0; i < list.length; i++) {
            res.push(this.binTreeToNumber(list[i]));
        }
        return res;
    };
    BinTree.binTreeToNumber = function (tree) {
        var counter = 0;
        if (tree !== null) {
            if (tree.elem === "") {
                counter++;
                counter += this.binTreeToNumber(tree.right);
            }
        }
        return counter;
    };
    BinTree.numberToBinTree = function (nb) {
        var res = new BinTree("nil", null, null);
        for (var i = 0; i < nb; i++) {
            res = this.cons(new BinTree("nil", null, null), res);
        }
        return res;
    };
    BinTree.stringToBinTree = function (str) {
        /*
        3 situations :
        -> str = (cons A B C...)
        -> str = (list A B C...)
        -> str = (nil)
        */
        if (str === null) {
            return null;
        }
        // On vérifie la troisième situation
        if (str === "(nil)") {
            return new BinTree("nil", null, null);
        }
        // On crée un tableau pour chaque mots du string 
        var re = /\s+|\(|\)/;
        var word = str.split(re);
        // On déclare un tableau d'arguement
        var args = [];
        // On est dans la première situation
        if (word[1] === 'cons') {
            var i = 2;
            while (word[i] !== '') {
                args.push(new BinTree(word[i], null, null));
                i++;
            }
            return this.consArray(args);
        }
        // On est dans la deuxième situation
        if (word[1] == 'list') {
            var i = 2;
            while (word[i] !== '') {
                args.push(new BinTree(word[i], null, null));
                i++;
            }
            args.push(new BinTree("nil", null, null));
            return this.consArray(args);
        }
    };
    BinTree.displayTree = function (tree) {
        if (tree.elem !== "") {
            return tree.elem;
        }
        var res = "(Cons ";
        res += this.displayTree(tree.left);
        res += ", ";
        res += this.displayTree(tree.right);
        res += ")";
        return res;
    };
    BinTree.displayTrees = function (trees) {
        var res = [];
        for (var _i = 0, trees_1 = trees; _i < trees_1.length; _i++) {
            var tree = trees_1[_i];
            res.push(this.displayTree(tree));
        }
        return res;
    };
    BinTree.isTrue = function (tree) {
        return tree.elem !== "nil";
    };
    return BinTree;
}());
exports.default = BinTree;
