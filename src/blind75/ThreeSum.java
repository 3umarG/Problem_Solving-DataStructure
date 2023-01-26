package blind75;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> res = threeSum(new int[]{0, 0, 0});
        for (List<Integer> l : res) {
            System.out.println(l);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        // My Solution :
        // Beats 9% Time / 5% Memory
        List<List<Integer>> res = new LinkedList<>();

        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - 3; i++) {

            // عشان اتاكد ان اول رقم ميكونش مكرر
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            int target = -nums[i];
            while (l < r) {
                if (nums[l] + nums[r] == target) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // عشان اتاكد ان الرقمين التانيين مفهمش مكرر
                    l++;
                    r--;

                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;

                } else if (nums[l] + nums[r] < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return res;
    }
}
