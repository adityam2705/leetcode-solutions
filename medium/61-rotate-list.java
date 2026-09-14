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
    public ListNode rotateRight(ListNode head, int k) {
        int count=1;
        ListNode temp=head;
        if(head==null){return null;}
        if(k == 0) return head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        temp.next=head;
        temp=head;
        k = k % count;   // ← ADD THIS LINE

        count=count-k-1;
        while(count!=0){
            temp=temp.next;
            count--;
        }
        ListNode ans=temp.next;
        temp.next=null;
        return ans;
    }
}