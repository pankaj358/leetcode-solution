public class AbsoluteDiffInBST
{

  int prev = -1;
  int minDiff = Integer.MAX_VALUE;

  public int absoluteDiff(TreeNode root)
  {
     dfs(root);
     return minDiff;
  }

  public void dfs(TreeNode root)
  {
    if(root == null) return;

    dfs(root.left);
    
    if(prev != -1)
    {
      int diff = Math.abs(root.val - prev);
      minDiff = Math.min(minDiff, diff);
    }

    prev = root.val;
    dfs(root.right);
  }


  class TreeNode
  {
    TreeNode left;
    TreeNode right;
    int val;
  }
}
