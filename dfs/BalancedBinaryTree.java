public class BalancedBinaryTree{

  private int height(TreeNode root){
     if(root == null) return 0;
     return Math.max(height(root.left), height(root.right)) + 1;
  }


  public boolean isBalancedBinaryTree(TreeNode root){
    if(root == null) return true;

    int left = height(root.left);
    int right = height(root.right);
    if(Math.abs(left - right) > 1) return false;

    return isBalancedBinaryTree(root.left) && isBalancedBinaryTree(root.right);
  }

  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
  }

}
