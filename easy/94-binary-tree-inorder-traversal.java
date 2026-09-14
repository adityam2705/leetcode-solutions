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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
          inorder(root,ans);
          return ans;
    }
    public void inorder(TreeNode Node,List<Integer> ans){
        if(Node== null)return;
        inorder(Node.left,ans);
        ans.add(Node.val);
        inorder(Node.right,ans);
    }
}