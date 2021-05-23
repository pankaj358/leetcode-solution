public class ValidateBST
{

  class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
  }


  public boolean validateBST(TreeNode root)
  {
     return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  private boolean validate(TreeNode root, long min, long max)
  {
   
    if(root == null) return true;

    if(root.val >= max || root.val <= min) return false;

    return validate(root.left, min, root.val) && validate(root.right, root.val, max);

  }
  

}
