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
     int idx = 0;
   public TreeNode buildTree(int[] preorder, int[] inorder) {
          int n= preorder.length;

         return recurse(preorder,inorder,0,n-1);
          

    }
    TreeNode recurse(int[] preorder, int[] inorder, int start , int end){
           if(start>end){
            return null;}
            
            int rootval = preorder[idx++];
             int i=start;
            for(;i<=end;i++){
                if(inorder[i]==rootval){
                break;
            }}

          TreeNode curr = new TreeNode(rootval);
           curr.left =  recurse(preorder,inorder,start,i-1);
             curr.right = recurse(preorder,inorder,i+1,end);

                  return curr;            }
    } 