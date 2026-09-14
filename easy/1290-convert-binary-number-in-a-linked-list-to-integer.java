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
    public int getDecimalValue(ListNode head) {
       ListNode temp=head;
       int count=0;
       if(head.next==null && head.val==1)return 1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        int sum=0;
        while(temp!=null){
            sum+=temp.val*((int)Math.pow(2,count));
            temp=temp.next;
            count--;
        }
        return sum;
    }
}