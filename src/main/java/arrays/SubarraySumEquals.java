package arrays;

import java.util.Arrays;

public class SubarraySumEquals {
    public int subarraySumMethod1(int[] nums, int k) {
        int sums [] = new int[nums.length + 1];
        int sum = 0;
        int c  = 1;
        for (int num : nums) {
            sums[c] = sums[c - 1] + num;
            c++;
        }
        System.out.println(Arrays.toString(sums));
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (k == sums[j] - sums[i]) {
                    count++;
                }
            }
        }

        return count;

    }
}
