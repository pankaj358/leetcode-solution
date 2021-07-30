public class CountGoodNodes {

  class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
  }

  public int countGoodNodes(TreeNode root) {
    
    return 1 + count(root.left, root.val) + count(root.right, root.val);
  }

  private int count(TreeNode root, int val) {
     if(root == null) return 0;

     if(root.val >= val) {
       return 1 + count(root.left, root.val) + count(root.right, root.val);
     }

     return count(root.left, val) + count(root.right, val);
  }

}
