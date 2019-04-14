package arrays;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */
public class SearchInARotatedSortedArray {
    public int search(int[] nums, int target) {

        int pivot = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                pivot = i + 1;
                break;
            }
        }

        int result1 =  runBinarySearchIteratively(nums,target, 0, pivot -1 );
        int result2 = runBinarySearchIteratively(nums, target, pivot, nums.length -1 );
        if (result1 == -1 && result2 == -1) return -1;
        else if (result1 == -1) return result2;
        else return result1;
    }

    private int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInARotatedSortedArray().search(new int[] {1, 2, 3, 4}, 4));
    }
}
