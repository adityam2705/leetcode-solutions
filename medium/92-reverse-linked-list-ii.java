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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        int count=1;
             dummy.next=head;
         ListNode prev=dummy;
           for(int i = 0; i < left - 1; i++)
            prev = prev.next;
        
        ListNode curr = prev.next;
       
        // reversing
        for(int i = left; i < right ; i++){
            ListNode forw = curr.next; // forw pointer will be after curr
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }
        
         return dummy.next;
    }
}