package Soutions.recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle1 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();

        res.add(List.of(1));
        if (numRows == 1) return res;

        res.add(List.of(1, 1));
        if (numRows == 2) return res;

        // Above 2 Rows , with index = 2

        // For Rows
        for (int i = 2; i < numRows; i++) {
            List<Integer> prev = res.get(res.size() - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            // For Columns
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);

            res.add(curr);
        }

        return res;
    }
}
