package coursera.algorithms.algorithmtoolbox.dynamicprogramming;

import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, int[] w) {
        int[] val = Arrays.copyOfRange(w, 0, w.length);
        int [] [] result = new int[w.length + 1][W + 1];

        for (int i = 0; i <= w.length; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    result[i][j] = 0;
                } else if (j >= w[i - 1]) {
                    result[i][j] = Integer.max(result[i - 1][j], result[i - 1][j - w[i - 1]] + w[i - 1]);
                } else {
                    result[i][j] = result[i - 1][j];
                }
            }

        }

        return result[w.length][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

