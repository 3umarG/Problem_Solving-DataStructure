package Soutions;

import DataStructure.Heaps.MaxHeapsBuild;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height) {
        int size = height.length;

        if (size == 2) {
            return Math.min(height[0], height[1]);
        }

        int first = 0;
        int last = size - 1;
        int area = 1;
        while (first < last) {
            int width = last - first;
            int h = Math.min(height[first], height[last]);
            area = Math.max(area, width * h);

            if (height[first] <= height[last]) {
                first++;
            } else {
                last--;
            }
        }
        return area;
    }
}
