package Soutions;

import java.util.*;

class Score {
    int index, score;

    Score(int index, int score) {
        this.index = index;
        this.score = score;
    }
}

class ScoreComparator implements Comparator<Score> {
    @Override
    public int compare(Score s1, Score s2) {
        // return Positive if only and only if the s2 > s1 ...
        if (s2.score > s1.score) {
            // لو ال s2 اكبر من ال s1
            // SWAP
            return 1;
        }
        return -1;
    }
}


public class RelativeRank {
    public static void main(String[] args) {
        int[] scores = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(scores)));
//        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                // You don't Do AnyThing
//                if (o1 == o2) return 0;
//                    // No Swap
//                else if (o1 > o2) return -1;
//                    // Swap
//                else return 1;
//            }
//        });
//
//        queue.offer(10);
//        queue.offer(3);
//        queue.offer(8);
//        queue.offer(9);
//        queue.offer(4);
//        System.out.println(queue);
//        while (queue.peek() != null) {
//            int item = queue.poll();
//            System.out.println(item);
//        }

    }

    public static String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        PriorityQueue<Score> maxHeap = new PriorityQueue<>(new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                if (o1.score>o2.score) return -1;
                return 1;
            }
        });

        for (int i = 0; i < score.length; i++) {
            Score scoreInstance = new Score(i, score[i]);
            maxHeap.offer(scoreInstance);
        }

        for (int i = 0; i < score.length; i++) {
            Score scoreInstance = maxHeap.poll();
            assert scoreInstance != null;
            System.out.println(scoreInstance.score);
            if (i == 0) {
                answer[scoreInstance.index] = "Gold Medal";
            } else if (i == 1) {
                answer[scoreInstance.index] = "Silver Medal";
            } else if (i == 2) {
                answer[scoreInstance.index] = "Bronze Medal";
            } else {
                answer[scoreInstance.index] = Integer.toString(i + 1);
            }
        }
        return answer;
    }

}