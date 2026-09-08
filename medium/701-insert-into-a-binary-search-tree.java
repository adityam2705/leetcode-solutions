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
    public TreeNode insertIntoBST(TreeNode root, int val){
        
         TreeNode ans= new TreeNode(val);
         TreeNode curr=root;
         if(root==null) return ans;
    while(true){
       if(curr.val<=val){
            if(curr.right==null){curr.right=ans;
               break;}
              else{ curr=curr.right;}}
        else{
            if(curr.left==null){curr.left=ans;
            break;}

            else{ curr=curr.left;} }    }
        return root;
    }
}