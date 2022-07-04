package Soutions;

import java.util.Arrays;

public class TwoSumInputArray {
    public static void main(String[] args) {
        int[] arr={-1,0};
        System.out.println(Arrays.toString(twoSum(arr,-1)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        // [2,7,11,15]  target=9   Output: [1,2]
        // numbers = [2,3,4], target = 6      Output: [1,3]
        //  numbers = [-1,0], target = -1      Output: [1,2]
        int p1=0;
        int p2= numbers.length-1;

        while (p1<=p2){
            if(numbers[p1]+numbers[p2]==target){
                return new int[]{p1+1,p2+1};
            }
            if(numbers[p1]+numbers[p2]>target){
                p2--;
            }else {
                p1++;
            }
        }
        return new int[]{};
    }
}
