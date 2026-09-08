/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    List<Integer> result = new ArrayList<>();
     Map<TreeNode,TreeNode> parenttrack=new HashMap<>();
     mark(root,parenttrack);
     Map<TreeNode,Boolean> visited= new HashMap<>();
     Queue<TreeNode> q = new LinkedList<>();
      q.offer(target);
      visited.put(target,true);
     int currlevel=0;
     
     while(!q.isEmpty()){
        int size=q.size();
        if(currlevel==k) break;
           currlevel++;
        for(int i=0;i<size;i++){ 
            TreeNode curr=q.poll();
        if(curr.left!=null && !visited.containsKey(curr.left)){
             q.offer(curr.left);
             visited.put(curr.left,true); }
        if(curr.right!=null && !visited.containsKey(curr.right)){
            q.offer(curr.right);
            visited.put(curr.right,true); }
        if(parenttrack.get(curr) != null && !visited.containsKey(parenttrack.get(curr))){
            q.offer(parenttrack.get(curr));
            visited.put(parenttrack.get(curr),true);  }    } }
                 while(!q.isEmpty()){
                    TreeNode curr = q.poll();
                    result.add(curr.val); }    
                     return result;}

  void mark(TreeNode root,Map<TreeNode,TreeNode> parenttrack){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
       TreeNode curr = q.poll();
       if(curr.left!=null){
        parenttrack.put(curr.left,curr);
        q.offer(curr.left);}
       if(curr.right!=null){
        q.offer(curr.right);
        parenttrack.put(curr.right,curr);}   } }
} 