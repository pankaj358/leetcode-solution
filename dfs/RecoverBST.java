public class RecoverBST
{

  TreeNode first = null;
  TreeNode second = null;
  TreeNode prev = new TreeNode(Integer.MIN_VALUE);

  public void recover(TreeNode root){
   inorder(root);
   int tmp = first.val;
   first.val = second.val;
   second.val = tmp;

  }

  private void inorder(TreeNode root){
    if(root == null) return;
    inorder(root.left);
    
    if(first == null && prev.val > root.val) first = prev;
    if(first != null && prev.val > root.val) second = root;

    prev = root;

    inorder(root.right);

  }

  class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    
    TreeNode(int val){
       this.val = val;
    }
  }
}
