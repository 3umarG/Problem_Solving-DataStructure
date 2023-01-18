package Soutions;

import java.util.HashMap;
import java.util.HashSet;

public class CycleLinkedList2 {
    /*
    *** Hash Set Solution :
     public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> map = new HashSet();
        ListNode c = head;
        while(c!=null && c.next != null){
            // You visit this Node previous ...
            if(map.contains(c)){
                return c;
            }

            // else
            map.add(c);
            c = c.next;
        }

        // You reach the end of the list and does not find any cycle ..
        return null ;
    }

     */

    /*
    * Fast - Slow Pointers
    *   public ListNode findIntersection(ListNode head){
         ListNode s = head;
         ListNode f = head;

       while(f != null && f.next != null){
           f = f.next.next;
           s = s.next;
           if(s == f) return f;
       }
       return null;

    }
    public ListNode detectCycle(ListNode head) {
      if(head == null || head.next == null) return null;

      ListNode intersection = findIntersection(head);
      if(intersection == null ) return null;

      while(head != intersection){
          head = head.next;
          intersection = intersection.next;
      }
      return head;
    }
     */
}
