package Soutions;



public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        //int c = removeElement(arr,2);
        int c = removeElement(arr, 2);
        System.out.println(c);
    }

    public static int removeElement(int[] nums, int value) {
        if (nums.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

//if(nums.length==0) return 0;
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//        if(nums[i]!=value){
//        nums[count]=nums[i];
//        count++;
//        }
//        }
//        return count;