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
    public boolean isSameTree(TreeNode p, TreeNode q) {
         check(p,q);
         return ans;
    }

    boolean ans=true;
    void check(TreeNode p, TreeNode q){
        if(p==null && q==null ){
            return;
        }
        if(p==null || q==null ){
            ans=false;
            return;
        }
    if(p.val!=q.val){
        ans=false;
        return;
    }
        check(p.left,q.left);
        check(p.right,q.right);
    }
}