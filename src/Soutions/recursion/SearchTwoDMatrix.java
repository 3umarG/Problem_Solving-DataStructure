package Soutions.recursion;

public class SearchTwoDMatrix {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        }, 32));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        return find(
                0,
                matrix.length - 1,
                0,
                matrix[0].length - 1,
                target,
                 matrix);
    }

    public static boolean find(int startRow,
                               int endRow,
                               int startCol,
                               int endCol,
                               double target,
                               int[][] nums) {

        // Base Case : 2X2 Matrix || One Element
        if (endRow - startRow <= 1 && endCol - startCol <= 1) {
            for (int i = startRow; i <= endRow; i++) {
                for (int j = startCol; j <= endCol; j++) {
                    if (nums[i][j] == target) {
                        return true;
                    }
                }
            }
            // Not Found
            return false;
        }

//l + (r - l) / 2
        int pivotRow = startRow + (endRow - startRow) / 2;
        int pivotCol = startCol + (endCol - startCol) / 2;

        // Second Base Case : Pivot
        if (nums[pivotRow][pivotCol] == target) return true;

        boolean isFindFirstMatrix = find(0, pivotRow, pivotCol, endCol, target, nums);
        boolean isFindSecondMatrix = find(pivotRow, endRow, 0, pivotCol, target, nums);

        boolean isFindThirdMatrix;
        if (target > nums[pivotRow][pivotCol]) {
            // Discard Top Left Sub Matrix
            isFindThirdMatrix = find(pivotRow, endRow, pivotCol, endCol, target, nums);
        } else {
            // Discard bottom right sub matrix
            isFindThirdMatrix = find(0, pivotRow, 0, pivotCol, target, nums);
        }

        return isFindFirstMatrix || isFindSecondMatrix || isFindThirdMatrix;
    }


}
