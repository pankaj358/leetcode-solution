public class MinDepthOfBinaryTree
{
  public int minDepth(TreeNode root) {
      if(root == null) return 0;

      int lh = minDepth(root.left);
      int rh = minDepth(root.right);

      return (lh == 0 || rh == 0) ? lh + rh + 1 : Math.min(lh, rh) + 1;
    
  }

  class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;     
  
  }
  
}
