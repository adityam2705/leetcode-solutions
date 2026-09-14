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
    Integer prev = null;
    int min;
    public int getMinimumDifference(TreeNode root) {
        min=Integer.MAX_VALUE;
        prev=null;
        dfs(root);
        return min;
    }
    
void dfs(TreeNode root) {
    if(root==null) return;
       
  dfs(root.left);
  if (prev != null) {
    min =Math.min(min, root.val-prev);
}
prev = root.val;
  dfs(root.right);
}
}