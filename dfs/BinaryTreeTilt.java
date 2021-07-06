public class BinaryTreeTilt
{
  private int tilt = 0;
  public int tilt(TreeNode root)
  {
    postorder(root);
    return tilt;
  }

  public int postorder(TreeNode root)
  {
     if(root == null) return 0;
   
     int leftSum = postorder(root.left);
     int rightSum = postorder(root.right);
     tilt += Math.abs(leftSum -  rightSum);
     
     return root.val + leftSum + rightSum;        

  }

  class TreeNode 
  {
    TreeNode left;
    TreeNode right;
    int val;
  }
}
