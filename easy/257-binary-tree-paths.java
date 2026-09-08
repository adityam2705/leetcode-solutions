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

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        dfs(root, new StringBuilder(), result);

        return result;
    }

    private void dfs(TreeNode root,
                     StringBuilder path,
                     List<String> result) {

        if(root == null) return;

        int len = path.length();

        path.append(root.val);

        if(root.left == null && root.right == null){
            result.add(path.toString());
        }
        else{
            path.append("->");

            dfs(root.left, path, result);
            dfs(root.right, path, result);
        }

        path.setLength(len);   // Backtrack
    }
}