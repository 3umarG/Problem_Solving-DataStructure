package blind75;

import java.util.Arrays;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));
//        System.out.println(findMin(new int[]{
//                4, 5, 6, 7, 0, 1, 2
//        }));
    }

    public static int search(int[] nums, int target) {
/*
        int size = nums.length;

        // Sorted
        if (nums[0] <= nums[size - 1]) {
            return sortedSearch(0, size - 1, nums, target);
        }

        // Not Sorted : Rotated

        // First we find the minimum number that the array rotated on it ...
        int minRotate = findMin(nums);

        // Binary Search in both Sorted Array around the element ...
        int resLeft = sortedSearch(0, minRotate - 1, nums, target);
        int resRight = sortedSearch(minRotate, size - 1, nums, target);

        if (resLeft==-1 && resRight==-1){
            return -1;
        }else if (resLeft != -1){
            return resLeft;
        }else {
            return resRight;
        }

 */


        // This condition for the middle numbers from the last number
        // ... and the first number , when reorder the array ...
        if(target > nums[nums.length-1] && target < nums[0])
            return -1;

        if(target > nums[nums.length-1]){
            // ازاي ال loop دي هبقى log(n)
            // لان ببساطة انت متاكد ان في رقم هيكسر اللوب في النص وهو بداية ال rotate
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target)
                    return i;
            }
        }
        else{
            // target < nums[size-1]
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]==target)
                    return i;
            }
        }
        return -1;

        // [3,4,5,1,2] == [1,2,3,4,5]
        // عشان كده لما انت بتيجي تقارن كانك بتقارن من النص وانت مش واخد بالك
    }

    public static int findMin(int[] nums) {
        int n = nums.length;

        // Edge Case : Already sorted and not rotated ...
        if (nums[0] < nums[n-1]) return nums[0];

        // Rotated :
        int l=0 , r = n-1;
        while (l < r){
            int mid = (l+r)/2;
            if (nums[mid] <= nums[r] && nums[mid] >= nums[l]){
                return l;
            }else if (nums[mid] > nums[r]){
                l = mid+1;
            }else {
                r = mid;
            }
        }
        return l;
    }

    public static int sortedSearch(int l, int r, int[] nums, int target) {
        while (l <= r) {
            // 4,  (5)  ,6,7
            int mid = (l + r) / 2;
            if (nums[mid] == target) return mid;

            if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
