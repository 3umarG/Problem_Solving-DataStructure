package Soutions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FurthestBuilding {
    public static void main(String[] args) {

//        int[] h={14,3,19,3};
//        int ladders=0;
//        int bricks=17;
//        System.out.println(furthestBuilding(h,bricks,ladders));

    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        // To Return the Max Value...
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i]>=heights[i+1]) continue;
            int diff=heights[i+1]-heights[i];
            // هتعامل على ان ال bricks هي المناسبة
            bricks-=diff;
            priorityQueue.add(diff);

            // لو وصلت ان ال bricks اصبحت < 0
            // يبقى ده مؤشر اني ارتكبت خطأ في النص وانا بستعمل ال bricks كــ tool
            // ولازم اني ارجع عن الخطأ ده واستعمل بدل منها ال ladder
            // ladders : For Long Distance
            // Bricks : For Short Distance
            if (bricks<0){
                bricks+= priorityQueue.poll();
                if (ladders>0){
                    ladders--;
                }else {
                    // ladders finished ...
                    // Bricks are not much for Jumping ...
                    return i;
                }

            }
        }
        return heights.length-1;
    }
}
