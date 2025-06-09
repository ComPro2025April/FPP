package lab2.prog2_7;

import java.util.Random;

public class Prog2_7 {
    public static void main(String[] args) {
        int NUM_PROBLEMS = 8;
        int low = 1, high = 100;
        int[] leftOperands = new int[NUM_PROBLEMS];
        int[] rightOperands = new int[NUM_PROBLEMS];

        Random rand = new Random();

        // Generate random numbers between 1 and 99
        for (int i = 0; i < NUM_PROBLEMS; i++) {
            leftOperands[i] = rand.nextInt(high) + low;
            rightOperands[i] = rand.nextInt(high) + low;
        }

        // Print problems in 2 rows of 4 problems each
        for (int row = 0; row < 2; row++) {
            int start = row * 4;
            int end = start + 4;

            // First row: left operands
            for (int i = start; i < end; i++) {
                System.out.printf("%8d", leftOperands[i]);
            }
            System.out.println();

            // Second row: + right operands
            for (int i = start; i < end; i++) {
                System.out.printf("  +%5d", rightOperands[i]);
            }
            System.out.println();

            // Third row: underscores
            for (int i = start; i < end; i++) {
                System.out.printf("%8s", "_____");
            }
            System.out.println("\n");
        }
    }
}
