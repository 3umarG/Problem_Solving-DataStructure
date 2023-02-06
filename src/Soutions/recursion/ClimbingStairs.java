package Soutions.recursion;

import java.util.HashMap;

public class ClimbingStairs {
    static HashMap<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(climb(4));
    }

    public static int climb(int n) {
        // Check if I have calculated this function or not
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        // Base Case :
        if (n <= 2) {
            result = n;
        } else {
            // Recursive Function
            result = climb(n - 1) + climb(n - 2);
        }
        cache.put(n, result);
        return result;
    }
}
