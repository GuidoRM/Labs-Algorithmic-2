package org.tree;

// T tree = 5n + 27oe

public class Tree {
    private long value; 
    private Tree left;
    private Tree right;

    public Tree(long value) {
        this.value = value; // 1 OE
    }

    public long getValue() {
        return value; // 1 OE
    }

    public void setValue(long value) {
        this.value = value; // 1 OE
    }

    public Tree getLeft() {
        return left; // 1 OE
    }

    public void setLeft(Tree left) {
        this.left = left; // 1 OE
    }

    public Tree getRight() {
        return right; // 1 OE
    }

    public void setRight(Tree right) {
        this.right = right; // 1 OE
    }

    public boolean isLeaf() {
        return left == null && right == null; // 3 OE
    }

    // Devuelve la altura si está equilibrado; -1 en caso contrario.
    // T checkHeight = 16 OE
    public int checkHeight() {
        int leftHeight = (left == null) ? 0 : left.checkHeight(); // 3 OE
        if (leftHeight == -1) return -1; // 2 OE

        int rightHeight = (right == null) ? 0 : right.checkHeight(); // 3 OE
        if (rightHeight == -1) return -1; // 2 OE

        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // 4 OE

        return Math.max(leftHeight, rightHeight) + 1; // 2 OE
    }

    // T insert = 5n + 1oe
    public void insert(long val) {
        Tree current = this; // 1 OE

        while (true) {
            // 5 oe 
            if (val < current.value) { // 1 OE
                if (current.left == null) { // 1 OE
                    current.left = new Tree(val); // 2 OE
                    return; // 1 OE
                }
                current = current.left; // 1 OE
            } 
            else { 
                if (current.right == null) { // 1 OE
                    current.right = new Tree(val); // 2 OE
                    return; // 1 OE
                }
                current = current.right; // 1 OE
            }
        }
    }
}
