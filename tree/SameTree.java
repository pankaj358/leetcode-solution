public class SameTree
{

  public boolean isSame(TreeNode p, TreeNode q)
  {
     if(p == null) return q == null;
     
     if(q == null) return p == null;

     if(p.val != q.val) return false;

     return isSame(p.left, q.right) && isSame(p.right, q.right);
  }

}
