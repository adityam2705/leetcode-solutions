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
    int result=0;
    public int sumNumbers(TreeNode root) {
      int count=0;
      dfs(root,count);    
      return result; 
    }

    void dfs(TreeNode root,int count){

        count=root.val+count*10;

       if(root.left ==null && root.right==null){
         result+=count;
         return;}

       
        if(root.left!=null)dfs(root.left,count);
        if(root.right!=null)dfs(root.right,count);

    }
}