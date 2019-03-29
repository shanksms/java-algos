package dp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LongestIncreasingSubsequence {

    private static int longestIncreasingSubSeq(int arr []) {

        int [] lis = IntStream.range(0, arr.length).map(e -> 1).toArray();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        System.out.println(Arrays.toString(lis));
        return 0;
    }

    public static void main(String[] args) {
        longestIncreasingSubSeq(new int [] {10, 22, 9, 33, 21, 50, 41, 60});
    }
}
