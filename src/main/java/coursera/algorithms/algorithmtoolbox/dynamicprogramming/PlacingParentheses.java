package coursera.algorithms.algorithmtoolbox.dynamicprogramming;

import java.util.Scanner;

public class PlacingParentheses {
    private static long getMaximValue(String exp) {
      //write your code here
        int n1 = exp.length() / 2;
        int n2 = n1 + 1;
        int [] operands = new int[n2];
        char [] operators = new char[n1];

        char [] cA = exp.toCharArray();
        int j = 0; int k = 0;
        for (int i = 0; i < cA.length; i++) {
            if (i % 2 == 0) {
                operands[j] = Integer.parseInt(cA[i] + "");
                j++;
            } else {
                operators[k] = cA[i];
                k++;
            }
        }

        long [] [] min = new long[n2][n2];
        long [] [] max = new long[n2][n2];
        for (int i = 0; i < n2; i++) {
            min[i][i] = operands[i];
            max[i][i] = operands[i];
        }
        for (int s = 1; s < n2; s++) {
            for (int i = 0; i < n2 - s; i++) {
                int t = i + s;
                long []  mM = minMax(i ,t, min, max, operators);
                min[i][t] = mM[0];
                max[i][t] = mM[1];
            }
        }
        return max[0][n2 - 1];
    }

    private static long[] minMax(int i, int j, long [] [] min, long [] [] max, char [] operators) {
        long minVal = Integer.MAX_VALUE;
        long maxVal = Integer.MIN_VALUE;

        for (int k  = i; k <= j-1; k++) {
            long a = eval(max[i][k], max[k + 1][j], operators[k]);
            long b = eval(max[i][k], min[k + 1][j], operators[k]);
            long c = eval(min[i][k], max[k + 1][j], operators[k]);
            long d = eval(min[i][k], min[k + 1][j], operators[k]);
            minVal = Math.min(a, Math.min(b, Math.min(c, Math.min(d, minVal))));
            maxVal = Math.max(a, Math.max(b, Math.max(c, Math.max(d, maxVal))));

        }


        return new long[]{minVal, maxVal};
    }

    private static long eval(long a, long b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            assert false;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.next();
        System.out.println(getMaximValue(exp));
    }
}

