package Soutions;

import java.util.Arrays;

public class RunningSumOfOneDimArr {
    public static void main(String[] args) {
        int[] arr ={3,1,2,10,1};
        arr=sum(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sum(int[] nums){
        for (int i = 1; i <nums.length ; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
