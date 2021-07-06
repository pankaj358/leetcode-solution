public class InvertBinaryTree
{
   public TreeNode invertBinaryTree(TreeNode root)
   {
       if(root == null) return root;

       TreeNode newRoot = new TreeNode(root.val);
       newRoot.left = invertBinaryTree(root.right);
       newRoot.right = invertBinaryTree(root.left);
       return newRoot;
   }

   class TreeNode 
   {
      TreeNode left;
      TreeNode right;
      int val;
    
      TreeNode(int val)
      {
         this.val = val;
      }
   }
}
