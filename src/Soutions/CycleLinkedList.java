package Soutions;

import java.util.HashMap;
import java.util.HashSet;

public class CycleLinkedList {
    public static void main(String[] args) {

    }

    /*
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */



    /*
    public class Solution {
        // Fast & Slow Pointer Solution
        public boolean hasCycle(ListNode head) {
            ListNode slow_p = head;
            ListNode fast_p = head;
            while(fast_p!=null && fast_p.next!=null){
                fast_p=fast_p.next.next;
                slow_p=slow_p.next;
                if(slow_p==fast_p){
                    // it is a cycle List
                    return true;
                }
            }
            return false;
        }
    }
     */
}
