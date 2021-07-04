public class SubtreeOfAnotherTree
{
   public boolean isSubtree(TreeNode root, TreeNode subRoot){
     
     if(root == null) return subRoot == null;

    if(root.val == subRoot.val && isIdentical(root, subRoot)) return true;

    return isSubtree(root.left, subRoot.left) || isSubtree(root.right, subRoot.right);     
  }

  private boolean isIdentical(TreeNode root, TreeNode subRoot)
  {
     if(root == null && subRoot == null ) return true;

     if(root == null || subRoot == null || root.val != subRoot.val) return false;

     return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right); 
  }

  class TreeNode 
  {
    TreeNode left;
    TreeNode right;
    int val;
  }
}
