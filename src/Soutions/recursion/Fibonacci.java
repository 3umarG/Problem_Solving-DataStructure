package Soutions.recursion;

import java.util.HashMap;

public class Fibonacci {
    /*
    ** Memoization:

    * is an optimization technique used primarily to speed up computer programs
    * by storing the results of expensive function calls,
    * and returning the cached result when the same inputs occur again.
     */
    public static HashMap<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        // Base Case
        if (n < 2) {
            // Save and store the result of the recursion fun.
            cache.put(n, n);
            return n;
        }
        int result;
        if (cache.containsKey(n)) {
            // Already Calculated this fib(n)
            // I will get the result directly with re-calculate
            result = cache.get(n);
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        cache.put(n, result);
        return result;
    }
}
