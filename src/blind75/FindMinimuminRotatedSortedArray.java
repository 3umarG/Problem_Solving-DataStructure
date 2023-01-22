package blind75;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,6,1,2}));
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
                return nums[l];
            }else if (nums[mid] > nums[r]){
                l = mid+1;
            }else {
                r = mid;
            }
        }
        return nums[l];
    }
}
