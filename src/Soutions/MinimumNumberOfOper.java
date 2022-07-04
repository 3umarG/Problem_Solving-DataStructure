package Soutions;

import java.util.Arrays;

public class MinimumNumberOfOper {
    public static void main(String[] args) {
        int[] arr = {3,2,20,1,1,3};
        int x = 10;
        System.out.println(minOperationsWithSliding(arr, x));
    }

    public static int minOperations(int[] nums, int x) {
        int n = nums.length;
        if (nums[0] > x && nums[n - 1] > x) {
            return -1;
        }
        Arrays.sort(nums);

        int p1 = 0;
        int p2 = n - 1;
        int count = 0;
        int mid;
        //           p1       p2
        // nums = [3,2,20,1,1,3], x = 10
        while (x > 0 && p1 <= p2) {
            mid = (p1 + p1) / 2;
            if (nums[p1] >= nums[p2] && nums[p1] <= x) {
                count++;
                x = x - nums[p1];
                p1++;
            } else if (nums[p2] >= nums[p1] && nums[p2] <= x) {
                count++;
                x -= nums[p2];
                p2--;
            } else if (nums[p1] <= x) {
                count++;
                x = x - nums[p1];
                p1++;
            } else if (nums[p2] <= x) {
                count++;
                x -= nums[p2];
                p2--;
            }
        }
        if (x == 0) {
            return count;
        }
        return -1;
    }

    public static int minOperationsWithSliding(int[] nums, int x) {
        int target=-x;
        for(int item:nums) target+=item;
        if (target==0) return nums.length;
        if (target<0) return -1;

        int p1=0,p2=0,sum=0,numOfSteps=-1;
        while (p2<nums.length){
            sum+=nums[p2];
            // To Reduce Sum
            while (sum>target){
                sum-=nums[p1++];
            }
            // Number of Steps to Reach
            if(sum==target){
                numOfSteps=Math.max(numOfSteps,p2-p1+1);
            }
            p2++;
        }
        if(numOfSteps==-1){
            return -1;
        }
        return nums.length-numOfSteps;
    }
}
