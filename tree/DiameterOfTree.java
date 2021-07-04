public class DiameterOfTree
{
  int maxDepth = 0;
  public int diameterOfTree(TreeNode root)
  {
     helper(root);
     return maxDepth;
  }

  public int helper(TreeNode root)
  {
    if(root == null) return 0;

    int lh = helper(root.left);
    int rh = helper(root.right);
    maxDepth = Math.max(maxDepth, lh + rh);
    return Math.max(lh, rh) + 1 ;
  }

  class TreeNode 
  {
    TreeNode left;
    TreeNode right;
    int val;
  }
}
