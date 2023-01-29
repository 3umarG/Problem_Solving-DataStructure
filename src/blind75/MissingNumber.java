package blind75;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,3,4}));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2; // 3 * 4 = 12 / 2 = 6
        // size = 3
        // 0 1 2 3 = 6
        // 6 - x = miss
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return totalSum - sum;
    }
}
