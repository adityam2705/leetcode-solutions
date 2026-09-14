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
      class Info {
        boolean isBST;
        int sum;
        int min;
        int max;

        Info(boolean isBST, int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }}
    public int maxSumBST(TreeNode root) {
        recurse(root);
        return max;
    }
  int max=0;
    Info recurse(TreeNode root){
              
          if(root==null){return new Info(true,0, Integer.MAX_VALUE, Integer.MIN_VALUE);}

    
          Info left = recurse(root.left);
         
          Info right = recurse(root.right);

        if(left.isBST && right.isBST &&  root.val > left.max && root.val < right.min){
             int sum = left.sum + right.sum + root.val;
              max = Math.max(max,sum);
              
              int min=Math.min(left.min,root.val);
              int max=Math.max(right.max,root.val);
               return new Info(true,sum,min,max);
              }
    
          
          return new Info(false,0,0,0); }

    
}