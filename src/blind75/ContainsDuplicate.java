package blind75;

import java.util.Arrays;

public class ContainsDuplicate {
    /*

    * Given an integer array nums, return true if any value appears at least twice in the array,
    *  and return false if every element is distinct.

     */
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }

    // Space : O(N)
    // Time : O(N)
    public static boolean containsDuplicate(int[] nums) {
        /*
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;

         */

        // Space : O(1)
        // Space : O( n*log(n) )
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]) return true;
        }
        return false;
    }
}
