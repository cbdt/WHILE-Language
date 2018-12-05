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
}

function hd(tree: BinTree): BinTree {
    if (tree.elem === "nil") {
        return tree.left;
    } else {
        return new BinTree("nil", null, null);
    }
}

function tl(tree: BinTree): BinTree {
    if (tree.elem === "nil") {
        return tree.right;
    } else {
        return new BinTree("nil", null, null);
    }

}