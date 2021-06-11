public class LongestUnivaluePath
{
   public int longestUnivaluePath(TreeNode root) {
      if(root == null) return 0;
      int res[] = new int[1];
       
      dfs(root, res);
        
      return res[0];
   }

   private int dfs(TreeNode root, int[]res) {
      int l = root.left != null ? dfs(root.left, res) : 0;
      int r = root.right != null ? dfs(root.right, res) : 0;
 
      int resL = root.left != null ? root.left.val == root.val ? l + 1 : 0 : 0;
      int resR = root.right != null ? root.right.val == root.val ? r + 1 : 0 : 0;
       
      res[0] = Math.max(res[0], resL + resR);

      return Math.max(resL, resR);
   }
}
