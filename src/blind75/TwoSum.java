package blind75;

import java.util.HashMap;

public class TwoSum {
    /*
     * Given an array of integers nums and an integer target,
     * return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */

    // O(n*n) Solution
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static int[] twoSumWithSort(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int checker = target - nums[i];
            if (map.containsKey(checker)) {
                return new int[]{map.get(checker) , i};
            }
            map.put(nums[i] , i);
        }
        return null;
    }
}
