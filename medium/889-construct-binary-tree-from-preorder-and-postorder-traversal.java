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
    int idx=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n= postorder.length;
     return construct(preorder,postorder,0,n-1);
           
    }
     
     TreeNode  construct(int[] preorder,int[] postorder, int start, int end){
            if(start>end  || idx >= preorder.length){
                return null;}
           int rootval = preorder[idx++];
             TreeNode root = new TreeNode(rootval);
             if(start == end) { return root;}
  
         int i=start;
            int leftroot = preorder[idx];
         for(;i<end;i++){
            if(leftroot==postorder[i]){
                break;
            }
         }
    
          root.left=construct(preorder,postorder,start,i);
          root.right=construct(preorder,postorder,i+1,end-1);
         

         return root;




     }

}