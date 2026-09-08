/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
     StringBuilder result= new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        result = new StringBuilder(); 
        if(root==null)return result.toString();
        recurse(root);
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    void recurse(TreeNode root){
         if(root==null){
            result.append("null");
            result.append(",");
            return;}
         result.append(root.val);
         result.append(",");
          recurse(root.left);
          recurse(root.right);}

         int idx=0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
              idx=0;
               if(data.length() == 0) { return null;}
        String[] arr = data.split(",");
          return unrecurse(arr);   }

          TreeNode unrecurse(String []arr){
             if(arr[idx].equals("null")) { 
                idx++;
                 return null;}
             
              int rootval=Integer.parseInt(arr[idx++]);
              TreeNode root= new TreeNode(rootval);
              root.left= unrecurse(arr);
              root.right=unrecurse(arr);
              return root;
          }
          
               




           }

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));