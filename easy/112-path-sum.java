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
    public boolean hasPathSum(TreeNode root, int targetSum) {
    
         solve(root,targetSum);
         return found;
    }
    boolean found=false ;
    int start=0;
    void solve (TreeNode root, int target){
    

        if(root==null) return ;
                start += root.val;
                

if (root.left == null && root.right == null) {
             if(start == target) {
                found = true;
            }
        }            
            
             solve(root.left,target);
             solve(root.right,target);
                    start -= root.val;

                 
    }
}