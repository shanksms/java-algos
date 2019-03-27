package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RotateArrayToRight {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int [] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[k % len] = nums[i];
            k++;
        }
        System.arraycopy(result,0,nums,0,result.length);

    }

    public static void main(String[] args) {
        int [] arr = new int[] {1, 2, 3};
        rotate(arr, 4);
        System.out.println(Arrays.toString(arr));
        List<Integer> ls =
                IntStream.range(1, 3).boxed().collect(Collectors.toList());


    }
}
