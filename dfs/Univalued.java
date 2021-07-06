public class Univalued
{
  public boolean univalued(TreeNode root)
  {
     return univalued(root, root.val);
  }

  public boolean univalued(TreeNode root, int val)
  {
     if(root == null) return true;

     if(root.val == val)
      return univalued(root.left, val) && univalued(root.right, val);

     return false;
  }

  class TreeNode {
      TreeNode left;
      TreeNode right;
      int val;
   }
}
