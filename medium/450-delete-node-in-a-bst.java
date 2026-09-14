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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val==key)return helper(root);
            TreeNode curr=root;
    while(curr!=null){
        if(curr.val>key){
          if(curr.left!=null && key==curr.left.val){
                curr.left=helper(curr.left);
                break; }
            curr=curr.left; }
        else{
            if(curr.right!=null&& key==curr.right.val){
            curr.right=helper(curr.right);
            break; }
            curr=curr.right;}}       
            return root; }

      TreeNode helper(TreeNode curr){
        if(curr.right==null)return curr.left;
        if(curr.left==null)return curr.right;
            TreeNode lefthead=curr.left;
            TreeNode righthead=curr.right;
            TreeNode leftright= get(curr.left);
            leftright.right=righthead;
           return lefthead; }   

      TreeNode get(TreeNode curr){
                if(curr.right==null)return curr;
                 return get(curr.right); }
    
    }
