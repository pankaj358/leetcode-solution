public class SymmetricOrMirrorTree
{
   public boolean isSymmetric(TreeNode root)
   {

       return isSymmetric(root, root);
   }

   public boolean isSymmetric(TreeNode p, TreeNode q)
   {
      if( p == null) return q == null;
 
      if(q == null) return p == null;

      if(p.val != q.val) return false;

      return isSymmetric(p.left, q.right) && isSymmetric(p.right, p.left);
   }
}
