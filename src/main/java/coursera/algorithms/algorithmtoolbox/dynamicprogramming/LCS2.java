package coursera.algorithms.algorithmtoolbox.dynamicprogramming;

import java.util.*;

public class LCS2 {

    private static int lcs2(int[] a, int[] b) {
        //Write your code here
        int [] a1 = new int[a.length + 1];
        int [] b1 = new int[b.length + 1];

        System.arraycopy(a, 0, a1, 1, a.length);
        System.arraycopy(b, 0, b1, 1, b.length);

        int [][] result = new int[a1.length][b1.length];


        for (int j = 1; j < b1.length; j++) {
            for (int i = 1; i < a1.length; i++) {
                if (a1[i] == b1[j]) {
                    result[i][j] =  result[i - 1][j - 1] + 1;
                } else {
                    result[i][j] = Integer.max(result[i - 1][j], Integer.max(result[i][j - 1], result[i - 1][j - 1]));

                }

            }
        }
        return result[a.length][b.length];
    }

    public static void main(String[] args) {
        //try case 3,3,1 and 1,3,3
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b));
    }
}

