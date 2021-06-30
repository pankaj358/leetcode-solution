public class OrderSearchTree
{

   TreeNode curr = null;
   
   public TreeNode orderSearchTree(TreeNode root)
   {
     TreeNode ans = new TreeNode(0);
     curr = ans;
     inorder(root);
     return ans.right;
   }

   public void inorder(TreeNode root)
   {
     if(root == null) return;

     inorder(root.left);
     root.left = null;
     curr.right = root;
     curr = root;
     inorder(root.right);
   }

  
  class TreeNode 
  {

    public TreeNode(int data) {
      this.data = data;
    }
    int data;
    TreeNode left;
    TreeNode right;
  }

}
