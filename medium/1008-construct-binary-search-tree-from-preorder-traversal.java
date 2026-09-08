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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n= preorder.length;
       return construct(preorder,Integer.MAX_VALUE);}
        int idx=0;
 TreeNode construct(int[]preorder, int bound){

        if( idx==preorder.length|| preorder[idx]>bound ){
            return null;}

        int rootval=preorder[idx++];
        
         TreeNode root = new TreeNode(rootval);
         root.left = construct(preorder,rootval);
         root.right = construct(preorder,bound);
          return root;
       }
}