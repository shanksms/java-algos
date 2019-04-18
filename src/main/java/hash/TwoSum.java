package hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int [] twoSumBetterSolution(int [] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
