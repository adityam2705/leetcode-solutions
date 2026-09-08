
class Solution {
    int ans=0;
    public int maxPathSum(TreeNode root) {
            ans=root.val;
              recurse(root);
              return ans;
    }
    
    int recurse(TreeNode root){
         if(root==null)return 0;
        int leftsum = recurse(root.left);
        int rightsum =recurse(root.right);
        if(leftsum<0) leftsum=0;
        if(rightsum<0) rightsum=0;
         ans=Math.max(ans,root.val+leftsum+rightsum); 
         return root.val+Math.max(rightsum,leftsum);
    }
}