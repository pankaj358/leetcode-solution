public class HeightBalancedTree
{

  public boolean isHeightBalanced(TreeNode root)
  {
     if(root == null) return true;
     
     int lh = height(root.left);
     int rh = height(root.right);
 
     int min = Math.min(lh, rh);
     int max = Math.max(lh, rh);

     int diff = max - min;
 
     if(diff > 1)  return false;

     return isHeightBalanced(root.left) && isHeightBalanced(root.right);   
  
  }

  
  private int height(TreeNode root)
  {
     if(root == null) return 0;

     return Math.max(height(root.left), height(root.right)) + 1;
  }

}
