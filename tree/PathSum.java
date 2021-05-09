public class PathSum
{

 static class TreeNode
 {
   TreeNode left;
   TreeNode right;
   int val;

   TreeNode(int val)
   {
     this.val = val;
   }
 }



  public boolean hasPathSum(TreeNode root, int targetSum)
  {
     if(root == null) return false;

     if(root.left == null && root.right == null && root.val == targetSum)
       return true;
 
     return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
  }

}
