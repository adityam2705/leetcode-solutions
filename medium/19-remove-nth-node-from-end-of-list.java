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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        ListNode temp=head;

        if(head.next==null){
            return null;}

        while(temp!=null){
           count++;
           temp=temp.next;
        }
        if(count==n){
            ListNode newhead=head.next;
            return newhead;
        }
        temp=head;
        int res= count-n;
        while(temp!=null){res--;
            if(res==0) break;
            temp=temp.next;
            
        }
       if (temp != null && temp.next != null) {
            temp.next = temp.next.next;}
return head;
    }
}