package Soutions.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    public static List<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(n, k, 1, new ArrayList<>(), res);
        return res;
    }

    public static void helper(
            int n, int k, int curr, ArrayList<Integer> temp,
            ArrayList<ArrayList<Integer>> res
    ) {

        // TODO : Optimal Solution / Base Case
        if (temp.size() == k) {
            // add to the result
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = curr; i <= n; i++) {
            // Todo : Add this Solution to Combinations
            temp.add(i);

            // Todo : Recursion Function to go deeper / Go to more Branches
            helper(n, k, i+1, temp, res);

            // Todo : Backtrack to the previous level to find more solutions
            temp.remove(temp.size() - 1);
        }
    }

}
