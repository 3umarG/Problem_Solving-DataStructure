package Soutions;

public class RemoveNthFromTheEndOfLinkedList {
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode c_Node = head;
            int size=0;
            while(c_Node!=null){
                size++;
                c_Node=c_Node.next;
            }
            if(size==1){
                head=null;
                return head;
            }
            if(size==n){
                head=head.next;
                return head;
            }

            int index=size-n;
            ListNode prev=head;
            ListNode curr=head.next;
            int i=0;
            while(i<index-1){
                prev=prev.next;
                curr=curr.next;
                i++;
            }
            prev.next=curr.next;
            return head;
        }
    }
     */

}
