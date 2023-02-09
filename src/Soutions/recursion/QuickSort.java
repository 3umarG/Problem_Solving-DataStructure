package Soutions.recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,3,8,10,9,12,7};
        quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    /*
    *
    * Quick Sort :
    *
    * 1-Partition :
    * Sort one element at the right index "pivot"
    * then divide the array around this pivot
    *
    * 2-Do Partitioning Recursively on the both sub arrays
     */

    /*
    *
    * Pros:
    * - Do not need extra space like Merge Sort
    * - if you except the array not be sorted , it is more efficient than Merge
    *
    * Cons:
    * - The Worst Case : O (n*n)
    * - if the array is sorted asc or desc the partition not work well , and you will do sort for N time
    * - It will become as "insertion sort"
     */

    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pivot = partition(nums, start, end);
            quickSort(nums, start, pivot - 1);
            quickSort(nums, pivot + 1, end);
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int l = start;
        int h = end;
        int pivotValue = nums[l];

        while (l < h) {
            if (pivotValue > nums[h]) {
                // Swap
                int temp = nums[h];
                nums[h] = nums[l];
                nums[l] = temp;

                l++;
            } else if (pivotValue < nums[l]) {
                int temp = nums[l];
                nums[l] = nums[h];
                nums[h] = temp;

                h--;
            } else {
                if (pivotValue == nums[h]) {
                    l++;
                } else if (pivotValue == nums[l]) {
                    h--;
                }
            }
        }

        return l;
    }
}
