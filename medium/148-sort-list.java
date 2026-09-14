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
    public ListNode merge(ListNode a, ListNode b) {
        ListNode c = new ListNode(-1);
        ListNode temp = c;

        while(a!=null && b!=null){
            if(a.val<=b.val){
                temp.next = a;
                temp=a;
                a = a.next;
            }
            else {
                 temp.next = b;
                 temp = b;
                b = b.next;
            }
        }
        if(a==null) temp.next = b;
        else temp.next=a;
        return c.next;

    }
    public ListNode sortList(ListNode head) {
        // basecase for recursion
        if(head==null || head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        // left middle nikal aur fir split 
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow aagya left middle pe 2 mei divide kr 
        ListNode a = head;
        ListNode b = slow.next;
        slow.next=null;

        // magic krke sort kro
        a = sortList(a);
        b = sortList(b);

        // merge dono list ko 
        ListNode c = merge(a,b);
        return c;

    }
}