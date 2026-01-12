package org.lab1.activity1;

import org.tree.Tree;
import java.util.Scanner;

public class NumbersOnATree {

    // T main = 19n + 34oe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 1 OE

        if (scanner.hasNextLine()) { // 1 OE
            String line = scanner.nextLine(); // 1 OE
            if (!line.trim().isEmpty()) { // 2 OE
                System.out.println(solve(line)); // 19n + 28oe
            }
        }
        scanner.close(); // 1 OE
    }

    // T solve = 19n + 28oe
    private static String solve(String input) {
        String[] parts = input.trim().split("\\s+"); // 2 OE
        int height = Integer.parseInt(parts[0]); // 2 OE
        String path = parts.length > 1 ? parts[1] : ""; // 3 OE

        Tree root = new Tree(1); // 11 OE

        Tree current = root; // 1 OE

        for (char direction : path.toCharArray()) {
            long currentIndex = current.getValue(); // 1 OE
            // 15 oe para el lado izquierdo y 16 oe para el lado derecho
            if (direction == 'L') { // 1 OE
                Tree leftChild = new Tree(currentIndex * 2); // 12 OE
                current.setLeft(leftChild); // 1 OE
                current = leftChild; // 1 OE
            } else if (direction == 'R') {
                Tree rightChild = new Tree((currentIndex * 2) + 1); // 13 OE
                current.setRight(rightChild); // 1 OE
                current = rightChild; // 1 OE
            }
        }
        // 2^(height + 1)
        long maxNodes = (long) Math.pow(2, height + 1); // 4 OE
        return String.valueOf(maxNodes - current.getValue()); // 3 OE
    }
}


