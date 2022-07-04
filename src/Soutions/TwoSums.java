package Soutions;

public class TwoSums {
    public static void main(String[] args) {

    }

    public static int[] twoSums(long[] nums, long target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
