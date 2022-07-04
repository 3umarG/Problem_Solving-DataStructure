package Soutions.DP;

import java.util.Arrays;

public class DeleteOperation {
    public static void main(String[] args) {
        System.out.println(minDistance("leetcode", "etco"));
    }

    public static int minDistance(String word1, String word2) {
        int size1 = word1.length();
        int size2 = word2.length();
        int[][] arr = new int[size1+1][size2+1];
        // size1 = word1 = i
        // size2 = word2 = j
        for (int i = 0; i <= size1; i++) {
            for (int j = 0; j <= size2; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    arr[i][j] = 1 + arr[i - 1][j - 1];
                } else {
                    arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
                }
            }
        }
//        for(int[] arr2:arr){
//            System.out.println(Arrays.toString(arr2));
//        }
        int same = arr[size1 ][size2 ];
        return ((word1.length() - same) + (word2.length() - same));
    }
}
