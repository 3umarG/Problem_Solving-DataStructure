package Soutions;

import java.util.LinkedList;

public class AddTwoNumbers {


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    /*
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            // pointer to head
            ListNode head = l1;

            // Pointer to prev
            ListNode prev = null;

            int carry = 0;
            int sum = 0;


            // This occur when both lists are at the same size ..
            while(l1 != null && l2 != null){
                sum = l1.val + l2.val + carry;
                l1.val = sum % 10 ;
                carry = sum / 10 ;

                prev = l1;
                l1 = l1.next;
                l2 = l2.next;
            }

// If there is still in List 1
            while(l1!=null){
                sum = l1.val + carry;

                l1.val = sum % 10 ;
                carry = sum / 10 ;

                prev.next = l1 ;
                prev = l1;

                l1 = l1.next;
            }


            // If there is still Elements in List 2
            while(l2 != null){
                sum = l2.val + carry;

                l2.val = sum % 10 ;
                carry = sum / 10 ;

                prev.next = l2;
                prev = l2;

                l2 = l2.next;
            }

            // There is still a carry
            if(carry > 0){
                ListNode last = new ListNode(carry);
                prev.next = last ;
                last.next = null;
            }

            return head;

        }
    }


     */

}
