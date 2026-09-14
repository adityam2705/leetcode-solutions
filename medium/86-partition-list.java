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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
        ListNode temp1=dummy;
        ListNode dummyw=new ListNode(-1);
         ListNode temp2=dummyw;
        
        while(head!=null){
           if(head.val<x){
             temp1.next=head;
              temp1=temp1.next;
           }
           else{
            temp2.next=head;
            temp2= temp2.next;
           }
           head=head.next;
        }
        temp2.next=null;
        temp1.next=dummyw.next;
        return dummy.next;
    }
}