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
    public boolean isPalindrome(ListNode head) {
Stack<Integer> st1= new Stack<>();
        ListNode temp= head;
        while(temp!=null){
            st1.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(!st1.empty()){
if(st1.pop()!=temp.val) return false;
        
            temp=temp.next;
        }
        return true;
}}