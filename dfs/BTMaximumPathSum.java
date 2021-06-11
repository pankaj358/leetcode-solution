public class BTMaximumPathSum
{
    public int binarytreeMaximumPathSum(TreeNode root){
       int []res = new int[1];
       res[0] = root.val;
       dfs(root, res);
       return res[0];
   }

   public int dfs(TreeNode root, int[] res){
       if(root == null) return 0;

       int l = Math.max(0, dfs(root.left, res));
       int r = Math.max(0, dfs(root.right, res));
       
       res[0] = Math.max(res[0], l + r + root.val);
       
       return Math.max(l, r) + root.val;
   } 

   class TreeNode {
       TreeNode left;
       TreeNode right;
       int val;
    }
}
