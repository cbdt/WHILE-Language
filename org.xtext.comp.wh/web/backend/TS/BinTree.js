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
            res[i] = this.binTreeToNumber(list[i]);
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
    BinTree.DisplayTree = function (tree) {
        if (tree.elem !== "") {
            return tree.elem;
        }
        var res = "(Cons ";
        res += this.DisplayTree(tree.left);
        res += ", ";
        res += this.DisplayTree(tree.right);
        res += ")";
        return res;
    };
    return BinTree;
}());
exports.default = BinTree;
