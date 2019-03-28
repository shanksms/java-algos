package dp;

import java.util.Arrays;

public class KnapSack01 {

    private static int knapSack(int values[] , int wt [] , int sackWeight) {
        int len = wt.length;
        int [][] K = new int[len + 1] [sackWeight + 1];

        for (int i = 0; i <= len; i++) {

            for (int j = 0; j <= sackWeight ; j++) {
                if (i == 0 || j == 0) {
                    K[i][j] = 0;
                    continue;
                }
                if (wt[i - 1] <= j) {
                    K[i][j] = Math.max(K[i-1][j], values[i - 1] + K[i - 1][j - wt[i - 1]]);
                } else {
                    K[i][j] = K[i - 1][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(K));
        return K[len][sackWeight];

    }

    public static void main(String[] args) {

        System.out.println(knapSack(new int[] {1500, 3000, 2000}, new int[] {1, 4, 3}, 4));
    }

}
