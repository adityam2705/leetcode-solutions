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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

       ListNode curr= head;
       ListNode prev=null;
       int trd=Integer.MAX_VALUE;
       int count=0;
       int first=-1;
       int last=-1;

  while(curr.next!=null){
    if(prev!=null){
      if((prev.val>curr.val && curr.val<curr.next.val) || (prev.val<curr.val && curr.val>curr.next.val)){
            if(first==-1){
                    first=count;}
            else{
             trd=Math.min(trd,count-last);  }
               last=count;
                }  } 
        prev=curr;
        curr=curr.next;
        count++;}
        
       if(first==-1||first==last) return new int[]{-1,-1};

       return new int[]{trd,last-first};
    }
}