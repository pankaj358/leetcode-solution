public class TreeFromPreorderAndInorder
{
  public TreeNode buildTree(int[] preorder, int[] inorder)
  {
     return buildTree(preorder, inorder, 0, preorder.length - 1);
  }

  int preIdx = 0;

  private TreeNode buildTree(int []preorder, int[] inorder, int start, int end)
  {
     if(start > end) return null;
     
     int inIdx = 0;
  
     TreeNode root = new TreeNode(preorder[preIdx++]);
    
     for(int idx = start; idx <= end; idx++)
     {
        if(inorder[idx] == root.val)
        {
          inIdx = idx;
          break;
        }
     }

     root.left = buildTree(preorder, inorder, start,  inIdx - 1);
     root.right = buildTree(preorder, inorder, inIdx + 1, end );
    
     return root;
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
