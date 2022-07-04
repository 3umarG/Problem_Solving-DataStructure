package Soutions;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Code.........
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        System.out.println(k);

    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k]=nums[i+1];
                k++;
            }
        }
        return k;
    }
}
