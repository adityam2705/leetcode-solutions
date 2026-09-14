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
            List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    
        List<Integer> curr= new ArrayList<>();
        recurse(root,0,curr,targetSum);         
   
    return result;
    }

     void recurse(TreeNode root, int currsum ,List<Integer> curr,int targetsum){
               
            if(root==null)return;

              currsum+=root.val;
              curr.add(root.val);

            if(root.left == null && root.right == null && currsum==targetsum){
                result.add(new ArrayList<>(curr));}

            
            recurse(root.left,currsum,curr,targetsum);
            recurse(root.right,currsum,curr,targetsum);
                      
               curr.remove(curr.size()-1);       
     }

}