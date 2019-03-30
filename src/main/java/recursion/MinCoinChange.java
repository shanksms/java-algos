package recursion;

public class MinCoinChange {

    public static int minCoins(int [] coins, int len, int value) {

        //base case
        if (value == 0) return 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            //we can only take those coins which are less than or equal to value
            if (coins[i] <= value) {
                int subResult = minCoins(coins, len, value - coins[i]);
                if (subResult != Integer.MAX_VALUE && subResult + 1 < result){
                    result = subResult + 1;
                }

            }


        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(minCoins(new int[] {9, 6, 5, 1, 1}, 5, 11));
    }
}
