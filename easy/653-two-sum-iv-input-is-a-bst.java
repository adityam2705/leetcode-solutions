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
    public boolean findTarget(TreeNode root, int k) {
        if(root.right==null && root.left==null)return false;
        List<Integer> temp= new ArrayList();
        inorder(root,temp);
        int left=0;
        int right=temp.size()-1;
        while(left<right){
            int sum=temp.get(left)+temp.get(right);
           if(sum==k)return true;
           if(sum<k)left++;
           if(sum>k)right--;
        }
        return ans;
    }
    boolean ans= false;
    void inorder(TreeNode root,List<Integer> temp){
            if(root==null ) return;

          inorder(root.left,temp);
          temp.add(root.val);
          inorder(root.right,temp);
    }
}