package Soutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumEraiseValue {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        System.out.println(maximumUniqueSubarray(arr)
        );
    }

    public static int maximumUniqueSubarray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int start=0,end=0 , currSum=0,maxSum=0;
        Set<Integer> sub=new HashSet<Integer>();
        while (end<nums.length){
            int currNum=nums[end];
            if (!sub.contains(currNum)){
                sub.add(currNum);
                currSum+=currNum;
                maxSum=Math.max(maxSum,currSum);
                end++;
            }else {
                int deleted=nums[start];
                sub.remove(deleted);
                currSum-=deleted;
                start++;
            }
        }
        return maxSum;
    }

    public static boolean isNotFound(ArrayList<Integer> arrayList,int num){
        for (int i = 0; i < arrayList.size(); i++) {
            if (num==arrayList.get(i)){
                return false;
            }
        }
        return true;
    }
}
