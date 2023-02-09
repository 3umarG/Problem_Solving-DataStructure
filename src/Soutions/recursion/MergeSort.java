package Soutions.recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5,4,3,2,1})));
    }

    /*
    *
    * Pros:
    * O(n*logn) ===> for all time complexities
    *
    * Cons:
    * Take O(n) space to store the sub arrays and the new one after combining
     */

    public static int[] sortArray(int[] nums) {
        // Base Case : Only one element or empty arr.
        if (nums.length <= 1) return nums;

        // Center Position to Crop the array and divide it from
        int pivot = nums.length / 2;

        // Left sub array & Right sub array.
        // still divide the array into two sub-arrays till reach to only one element.
        int[] left_sub = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int[] right_sub = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));

        // Merge the two sorted array
        // Combine
        return merge(left_sub, right_sub);
    }

    private static int[] merge(int[] left_sub, int[] right_sub) {
        int l = 0, r = 0, n = 0;
        int[] res = new int[left_sub.length + right_sub.length];

        // Merge the two sorted
        while (l < left_sub.length && r < right_sub.length) {
            if (left_sub[l] <= right_sub[r]){
                res[n] = left_sub[l];
                l++;
            }else {
                res[n] = right_sub[r];
                r++;
            }
            n++;
        }

        // if one of them has ended we add the whole sorted array directly.
        while (l< left_sub.length){
            res[n++] = left_sub[l++];
        }
        while (r<right_sub.length){
            res[n++] = right_sub[r++];
        }

        return res;
    }
}
