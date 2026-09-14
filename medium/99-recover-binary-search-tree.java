/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        check(root);
        if(first!=null && last!=null)swap(first,last);
        else if(first!=null && middle!=null){ swap(first,middle); }
    }
    TreeNode first=null;
    TreeNode middle=null;
    TreeNode last=null;
    TreeNode  prev = new TreeNode(Integer.MIN_VALUE);

        void check(TreeNode root){
            if(root==null)return;
            
            check(root.left);

            if(first==null && root.val<prev.val){
                   first=prev;
                  middle=root;}
                  
            else if(first!=null && root.val<prev.val){
                 last= root;
                  }
          prev=root; 
                check(root.right);

       }
        void swap(TreeNode root,TreeNode next){
             int val=root.val;
               root.val=next.val;
               next.val=val; }

}