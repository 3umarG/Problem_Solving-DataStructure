package Soutions.recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(getRowUtil(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            int p = pascal(rowIndex, i);
            res.add(p);
        }
        return res;
    }

    // Approach - 1
    // TC --> O(N * M) || SC --> O(N * M)
    // N --> numRows || M --> no of element in last row
    public static List<Integer> getRowUtil(int rowIndex) {
        // Base  - case
        if (rowIndex == 0) {
            List<Integer> currList = new ArrayList<>();
            currList.add(1);
            return currList;
        }

        // Main - logic
        List<Integer> prevList = getRowUtil(rowIndex - 1);
        // { 1 }

        List<Integer> currList = new ArrayList<>();
        currList.add(1);
        for (int i = 0; i < prevList.size() - 1; i++) {
            currList.add(prevList.get(i) + prevList.get(i + 1));
        }
        currList.add(1);

        return currList;
    }


    public static int pascal(int row, int column) {
        /*

         */
        if (column == 0 || row == column) return 1;
        else return
                pascal(row - 1, column - 1)
                +
                pascal(row - 1, column);
    }
}
