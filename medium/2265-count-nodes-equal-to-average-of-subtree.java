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
class Pair{

int count;
int sum;

Pair(int count,int sum){
    this.count=count;  
    this.sum=sum;}     }

class Solution {
    int result=0;
    public int averageOfSubtree(TreeNode root) {
       
    Pair ans=solve(root);

    return result; 

    }

    Pair solve(TreeNode curr){

    // leaf node
    if(curr.left==null && curr.right==null){

        result++;
        return new Pair(1,curr.val); }

    // only left
    if(curr.left!=null && curr.right==null){
       Pair left=solve(curr.left);
       int sum1=curr.val+left.sum;
       int avg=sum1/(left.count+1);
       
       if(avg==curr.val){
        result++;}

       return new Pair(left.count+1,sum1); }

    // only right
    if(curr.right!=null && curr.left==null){
       Pair right= solve(curr.right);
       int sum1=right.sum+curr.val;

       int avg=sum1/(right.count+1);

       if(avg==curr.val){
        result++;}
           
       return new Pair(right.count+1,sum1);}

      //rest

      Pair left=solve(curr.left);      
      Pair right=solve(curr.right);

      int sumn=left.sum+right.sum+curr.val;
      int countn=left.count+right.count+1;
                         
      int avg=sumn/countn;

      if(avg==curr.val){
        result++;}

      return new Pair(countn,sumn);
  
    }
}