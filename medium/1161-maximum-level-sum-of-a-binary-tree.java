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
    public int maxLevelSum(TreeNode root) {
         
         int max=Integer.MIN_VALUE;
         int level=0;
         
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
       int ans=root.val;

    while(!q.isEmpty()){
         int count=0;
         int size=q.size(); 
           level++;
         
     for(int i=0;i<size;i++){   
         TreeNode curr=q.poll(); 
            count+=curr.val;

     if(curr.left!=null)q.offer(curr.left); 
     if(curr.right!=null)q.offer(curr.right); }
      
      
        if(count>max){
            max=count;
            ans=level;}        }     


    return ans;
    }
}