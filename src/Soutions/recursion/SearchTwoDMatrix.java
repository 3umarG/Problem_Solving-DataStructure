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

    /*
    *
    * Start From Right-Top
    * if the target less than the current ===> back in column
    * if the target greater than the current ===> go deep in row
     */

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        if (matrix[0].length == 0) return false;

        return findRec(matrix, 0, matrix[0].length - 1, target);
    }

    private static boolean findRec(int[][] matrix, int row, int column, int target) {
        // Out of Bound
        if (row >= matrix.length || column < 0) return false;

        // Found
        if (matrix[row][column] == target) return true;

        if (target > matrix[row][column]) {
            return findRec(matrix, row + 1, column, target);
        } else {
            return findRec(matrix, row, column - 1, target);
        }
    }


}
