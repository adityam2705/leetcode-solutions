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
    public TreeNode reverseOddLevels(TreeNode root) {

      int level=0;
      Queue<TreeNode> q= new LinkedList<>();
      q.offer(root);

       while(!q.isEmpty()){
    
       int size=q.size();
       TreeNode[] arr= new TreeNode[size];

     for(int i=0;i<size;i++){
    
        arr[i]=q.poll();
    
       if(arr[i].left!=null){
        q.offer(arr[i].left); }

       if(arr[i].right!=null){
        q.offer(arr[i].right);}

        }

      if(level%2==1){
        int right=arr.length-1;
         
       for(int i=0;i<arr.length/2;i++){
        int swap=arr[i].val;
        arr[i].val=arr[right-i].val;
        arr[right-i].val=swap;} 

        } 
     level++;
       }

       return root;
    }
}