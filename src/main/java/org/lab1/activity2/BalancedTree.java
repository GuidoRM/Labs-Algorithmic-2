package org.lab1.activity2;

import java.util.Scanner;

public class BalancedTree {

    public static class Tree {
        private long value;
        private Tree left;
        private Tree right;

        public Tree(long var1) {
            this.value = var1;
        }

        public long getValue() {
            return this.value;
        }

        public void setValue(long var1) {
            this.value = var1;
        }

        public Tree getLeft() {
            return this.left;
        }

        public void setLeft(Tree var1) {
            this.left = var1;
        }

        public Tree getRight() {
            return this.right;
        }

        public void setRight(Tree var1) {
            this.right = var1;
        }

        public boolean isLeaf() {
            return this.left == null && this.right == null;
        }

        public int checkHeight() {
            int var1 = this.left == null ? 0 : this.left.checkHeight();
            if (var1 == -1) {
                return -1;
            } else {
                int var2 = this.right == null ? 0 : this.right.checkHeight();
                if (var2 == -1) {
                    return -1;
                } else {
                    return Math.abs(var1 - var2) > 1 ? -1 : Math.max(var1, var2) + 1;
                }
            }
        }

        public void insert(long var1) {
            Tree var3 = this;

            while (true) {
                while (var1 >= var3.value) {
                    if (var3.right == null) {
                        var3.right = new Tree(var1);
                        return;
                    }

                    var3 = var3.right;
                }

                if (var3.left == null) {
                    var3.left = new Tree(var1);
                    return;
                }

                var3 = var3.left;
            }
        }
    }

    // T main = 5n^2 + 30n + 24oe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 1 OE

        if (scanner.hasNextInt()) { // 1 OE
            int n = scanner.nextInt(); // 1 OE

            if (n > 0) {
                Tree root = null; // 1 OE

                if (scanner.hasNextInt()) {
                    int val = scanner.nextInt();
                    root = new Tree(val);
                }

                for (int i = 1; i < n; i++) { // n-1 iterations
                    if (scanner.hasNextInt()) { // 1 OE
                        int val = scanner.nextInt(); // 1 OE
                        if (root != null) { // 1 OR
                            root.insert(val); // 5n + 1oe
                        } else {
                            root = new Tree(val); // 5n + 27oe
                        }
                    }
                }

                if (root != null) { // 1oe
                    System.out.println(root.checkHeight() != -1 ? 1 : 0); // 16oe + 2 oe
                } else {
                    System.out.println(1); // 1 OE
                }
            } else {
                System.out.println(1);
            }
        }

        scanner.close(); // 1 OE
    }
}
