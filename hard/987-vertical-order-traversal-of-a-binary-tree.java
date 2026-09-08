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
 class pair{
    TreeNode node;
    int row;
    int col;
    pair(TreeNode node, int row, int col){
        this.node = node;
        this.row= row;
        this.col=col;
                   }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null)return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<pair> q= new LinkedList<>();   
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
       
       q.offer(new pair(root,0,0));
        while(!q.isEmpty()){
            pair p = q.poll();
            TreeNode curr = p.node;
            int row= p.row;
            int col= p.col;
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).offer(curr.val);
            if(curr.left!=null){
                q.offer(new pair(curr.left,row+1,col-1)); }
            if(curr.right!=null){
                q.offer(new pair(curr.right,row+1,col+1));}   
                     }    
             for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

            List<Integer> temp = new ArrayList<>();

            for (PriorityQueue<Integer> pq : rows.values()) {

                while (!pq.isEmpty()) {
                    temp.add(pq.poll());
                }
            } result.add(temp);}
            return result;}  }