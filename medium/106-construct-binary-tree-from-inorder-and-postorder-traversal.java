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
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
            int n=postorder.length;
            idx=n-1;
       return backtrack(inorder,postorder,0,n-1);}

    TreeNode backtrack(int[]inorder,int[]postorder,int start,int end){
        
            if(start>end){return null;}
                 

           int rootval=postorder[idx--];
               
            int i=start;

            for(;i<end;i++){
        if(inorder[i]==rootval){ break; }}
              
        TreeNode root= new TreeNode(rootval);
        
        root.right= backtrack(inorder,postorder,i+1,end);
        root.left= backtrack(inorder,postorder,start,i-1);
        
        
          return root;   }
}