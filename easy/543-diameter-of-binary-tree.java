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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
          max=0;
          help(root);
          return max;
        }
     public int help(TreeNode node) {
        if(node==null)return 0;
            int lt=help(node.left);
            int rt=help(node.right);
            max=Math.max(max,lt+rt);
           return   Math.max(lt,rt) + 1;  
}}