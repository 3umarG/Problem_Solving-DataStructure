package blind75;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {

        /*
        // First Solution O(n*n)
        // -2 1 -3 4 -1 2 1 -5 4
        //  i      j
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j]; //
                max = Math.max(max, sum);
            }
        }
        return max;
         */


        // Second Solution O(n)
        int currSum = nums[0];
        int max = currSum;

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], nums[i] + currSum);
            max = Math.max(max, currSum);
        }
        return max;
    }
}
