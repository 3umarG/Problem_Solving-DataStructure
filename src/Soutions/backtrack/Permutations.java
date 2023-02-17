package Soutions.backtrack;

import java.util.*;

public class Permutations {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        HashSet<Integer> list = new HashSet<>(Arrays.stream(nums).boxed().toList());
        List<List<Integer>> res = new ArrayList<>();
        helper(list , res , new ArrayList<>());
        return res;
    }

    private static void helper(HashSet<Integer> nums,
                               List<List<Integer>> res,
                               ArrayList<Integer> pref) {

        // Base Case - Termination Case :
        // You reach the final of the path
        // pref is full & possible nums is empty
        if (nums.size() == 0) {
            // I have full prefix of all previous paths
            res.add(new ArrayList<>(pref));
            return;
        }

        HashSet<Integer> remainingNums = new HashSet<>(nums);
        for (int num : nums) {
            // Add To Prefix
            // First Step Put the Number and update pref.
            remainingNums.remove(num);
            pref.add(num);

            // Recursion to go deep
            helper(remainingNums, res, pref);

            // Backtrack : add the prefix number for get all possible paths from this Node
            remainingNums.add(num);
            pref.remove(pref.size() - 1);
        }

    }


}
