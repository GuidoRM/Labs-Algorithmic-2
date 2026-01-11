package org.lab1.activity1;

import org.tree.Tree;
import java.util.Scanner;

/**
 * Solution for KTH Challenge 2014 Problem A: Numbers On a Tree.
 */
public class NumbersOnATree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.trim().isEmpty()) {
                System.out.println(solve(line));
            }
        }
        scanner.close();
    }

    private static String solve(String input) {
        String[] parts = input.trim().split("\\s+");
        int height = Integer.parseInt(parts[0]);
        String path = parts.length > 1 ? parts[1] : "";

        Tree root = new Tree(1);
        Tree current = root;

        for (char direction : path.toCharArray()) {
            long currentIndex = current.getValue();
            if (direction == 'L') {
                Tree leftChild = new Tree(currentIndex << 1);
                current.setLeft(leftChild);
                current = leftChild;
            } else if (direction == 'R') {
                Tree rightChild = new Tree((currentIndex << 1) + 1);
                current.setRight(rightChild);
                current = rightChild;
            }
        }

        long maxNodes = 1L << (height + 1);
        return String.valueOf(maxNodes - current.getValue());
    }
}
