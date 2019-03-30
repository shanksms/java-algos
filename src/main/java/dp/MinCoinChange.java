package dp;

import java.util.stream.IntStream;

public class MinCoinChange {
    public static int coinChange(int[] coins, int amount) {
        int [] result =
                IntStream.range(0, amount + 1).map(e -> Integer.MAX_VALUE).toArray();
        result[0] = 0;

        for (int i = 1; i < result.length; i++) {

            for (int j = 0; j < coins.length; j++) {
                //We need to choose those coins whose value is less or equal to amount.
                if (i >= coins[j]) {
                    int subResult = result[i - coins[j]];
                    if (subResult != Integer.MAX_VALUE
                            && 1 + subResult < result[i]) result[i] = 1 + subResult;
                }

            }
        }

        return result[amount];

    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[] {9, 6, 5, 1}, 11));
    }

}
