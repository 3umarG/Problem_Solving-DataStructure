package blind75;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{
                1,8,6,2,5,4,8,3,7
        }));
    }

    public static int maxArea(int[] height) {
        int size = height.length;

        // width = 1
        // height = min([0] , [1])
        if (size == 2) {
            return Math.min(height[0], height[1]);
        }


        // Two Pointers Technique
        // Because we have sorted width (end - start)
        int l = 0;
        int r = size - 1;
        int area = 1;
        while (l < r) {
            int width = r - l;
            int high = Math.min(height[l], height[r]);
            area = Math.max(area, width * high);

            if (height[l] <= height[r]){
                l++;
            }else {
                r--;
            }
        }
        return area;
    }
}
