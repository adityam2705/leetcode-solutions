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
    public TreeNode sortedArrayToBST(int[] nums) {

       return recurse(nums,0,nums.length-1);}
      

     TreeNode recurse(int[] nums, int i, int j){
        if (i > j) return null;
        int loc=j+(i-j)/2;

      TreeNode root=new TreeNode(nums[loc]);
 
         root.left=recurse(nums,i,loc-1);
         root.right=recurse(nums,loc+1,j);
 
       return root;
        
     }
    }
