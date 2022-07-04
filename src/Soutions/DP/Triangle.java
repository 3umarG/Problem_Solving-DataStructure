package Soutions.DP;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        list.add(List.of(2));
        list.add(List.of(3, 4));
        list.add(List.of(6, 5, 7));
        list.add(List.of(4, 1, 8, 3));
        List<List<Integer>> list2 = new LinkedList<List<Integer>>();
        list2.add(List.of(-1));
        list2.add(List.of(2, 3));
        list2.add(List.of(1, -1, -3));
        System.out.println(Arrays.toString(list2.toArray()));
        int val=minimumTotal(list2);
        System.out.println(val);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size()-2; i >= 0; i--) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                int min = Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                int sum = min + triangle.get(i).get(j);
                triangle.get(i).set(j, sum);
            }
        }
        return triangle.get(0).get(0);
    }


}
