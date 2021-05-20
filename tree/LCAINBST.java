public class LCAINBST
{
  
  class TreeNode {
     TreeNode left;
     TreeNode right;
     int val;
     TreeNode(int val)
     {
        this.val = val;
     }
   }

   public TreeNode lca(TreeNode root, TreeNode p, TreeNode q)
   {
       if(root == null) return null;
 
       int pVal = p.val;
       int qVal = q.val;

       if(pVal > root.val && qVal > root.val)
         return lca(root.right, p, q);
       else if(pVal < root.val && qVal < root.val )
         return lca(root.right, p, q);
       return root;
   }

}
