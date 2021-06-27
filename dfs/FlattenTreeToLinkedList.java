public class FlattenTreeToLinkedList{
  private TreeNode prev;
  public void flatten(TreeNode root){
    if(root == null) return;
    flatten(root.right);
    flatten(root.left);
    root.right = prev;
    root.left = null;
    prev = root;
  }

  class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
  }
}
