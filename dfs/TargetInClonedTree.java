public class TargetInClonedTree
{
  public TreeNode findTarget(TreeNode original, TreeNode cloned, TreeNode target)
  {
     if(cloned == null) return null;

     if(target.val == cloned.val) return cloned;
 
     TreeNode left = findTarget(original, cloned.left, target);
   
     if(left == null) return findTarget(original, cloned.right, target);

     return left;
  }

  class TreeNode 
  {
    TreeNode left;
    TreeNode right;
    int val;
  }
}
