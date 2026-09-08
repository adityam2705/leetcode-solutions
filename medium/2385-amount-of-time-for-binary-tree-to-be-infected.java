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
    TreeNode startnode;
    public int amountOfTime(TreeNode root, int start) {
        if(root.left==null && root.right==null) return 0;
                int level=0;
        HashMap<TreeNode,TreeNode> track= new HashMap<>();
              mark(root,track,start);
            HashSet<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
                 q.offer(startnode);
                 visited.add(startnode);
         while(!q.isEmpty()){
            int currlevel =q.size();
            level++;
            for(int i=0;i<currlevel;i++){
                    TreeNode curr =q.poll();
                 if(curr.left!=null && !visited.contains(curr.left)){
                     q.offer(curr.left);
                     visited.add(curr.left); }

                 if(curr.right!=null && !visited.contains(curr.right)){
                    q.offer(curr.right);
                    visited.add(curr.right);}

                if(track.get(curr)!=null && !visited.contains(track.get(curr))){
                    q.offer(track.get(curr));
                    visited.add(track.get(curr)); }
                            }}  
                            return level-1;}

         void mark(TreeNode root,HashMap<TreeNode,TreeNode> track,int start){
                Queue<TreeNode> q = new LinkedList<>();
                   q.offer(root);
                  
            while(!q.isEmpty()){
                TreeNode curr= q.poll();
                 if(curr.val == start) {
                    startnode = curr; }
                if(curr.left!=null){
                    q.offer(curr.left);
                    track.put(curr.left,curr);}
                if(curr.right!=null){
                    q.offer(curr.right);
                    track.put(curr.right,curr);}} }

           
}