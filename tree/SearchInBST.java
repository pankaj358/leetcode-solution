public class SearchInBST
{
  public TreeNode searchInBST(TreeNode root, int val)
  {
     if(root == null) return null;
  
     if(root.val == val) return root;

     if(root.val > val)
       return searchInBST(root.left, val);

     if(root.val < val)
       return searchInBST(root.right, val);

     return null;
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
