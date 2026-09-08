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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }

        ListNode dummye = new ListNode(-1);
        ListNode dummyo=new ListNode(head.val);
       ListNode curre=dummye;
       ListNode curro=dummyo;
       ListNode temp= head.next;
       int count=0;
        


       while(temp!=null){
        if(count%2==0){
        curre.next=temp;
        curre=curre.next;}
        if(count%2==1){
         curro.next=temp;
         curro=curro.next;}
             temp=temp.next;
             count++;}
        curro.next=dummye.next;
        curre.next=null;
        return dummyo;
    }
}