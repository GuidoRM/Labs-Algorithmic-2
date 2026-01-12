package org.tree;

// T tree = 10 OE
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
}
