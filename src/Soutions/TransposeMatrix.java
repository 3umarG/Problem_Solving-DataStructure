package Soutions;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        matrix=transpose(matrix);
        for (int[] ints : matrix) {
            System.out.print(Arrays.toString(ints));
        }
    }

    public static int[][] transpose(int[][] matrix){
        // 2 X 3
        int width = matrix.length; // 2
        int height = matrix[0].length; // 3
        int[][] newMatrix=new int[height][width]; // 3 X 2
        for(int i=0;i< height;i++){ // i = 3
            for(int j=0;j<width;j++){ // j = 2
                newMatrix[i][j]=matrix[j][i];
            }
        }
        return newMatrix;
    }
}
