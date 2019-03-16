package arrays;

import java.util.Arrays;

public class MaxSubArray {

    public static int maxSubArrayKdane(int[] nums) {
        int maxSum = nums[0];
        int consecSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            consecSum += nums[i];
            if (consecSum < nums[i]) {
                consecSum = nums[i];
            }

            if (consecSum > maxSum) maxSum = consecSum;
        }
        return maxSum;
    }

    public static int maxSubArrayDynamicArray(int[] nums) {

        int [] solution = new int[nums.length];
        solution[0] = nums[0];
        for (int i = 1; i < solution.length; i++) {
            solution[i] = Integer.max(solution[i - 1] + nums[i], nums[i]);

        }

       return Arrays.stream(solution).max().getAsInt();


    }

    public static void main(String[] args)
    {
        //System.out.println(maxSubArrayKdane(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArrayDynamicArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
}
