package Soutions;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] l = {5,3};
        System.out.println(lastStoneWeight(l));
        int i = new Scanner(System.in).nextInt();
        switch (i) {
            case 3 -> System.out.println("3");
            case 2 -> System.out.println("2");
        }
    }

    public static int lastStoneWeight(int[] stones) {
        int size = stones.length;
        if (size==1){
            return stones[0];
        }
        else if (size==2){
            int first = stones[0];
            int second = stones[1];
            if (first==second) return 0;
            else {
                int large = Math.max(first, second);
                int small = Math.min(first, second);
                return large-small;
            }
        }
        else {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            for (int i:stones){
                pq.add(i);
            }

            while (pq.size()>1){
                int max1 = pq.remove();
                int max2 = pq.remove();
                if (max1!=max2){
                    int res = max1-max2;
                    pq.offer(res);
                }
            }

            if (pq.size()==1){
                return pq.poll();
            }
            else {
                return 0;
            }
        }
    }
}
