public class TreeFromPostorderAndInorder
{

 int postIdx = 0; 
 
 public TreeNode build(int[] inorder, int[] postorder)
 {
    postIdx = postorder.length - 1;

    return build(inorder, postorder, 0, postIdx);
 }  

 private TreeNode build(int[] inorder, int[] postorder, int start, int end)
 {
    if(start > end)
    {
       return null;
    }

    TreeNode root = new TreeNode(postorder[postIdx--]);

    int inIdx = 0;    

    for(int idx = start; idx <= end; idx++)
    {
       if(inorder[idx] == root.val )
       {
         inIdx = idx;
         break;
       }
    }

    root.right = build(inorder, postorder, inIdx + 1, end);
    root.left = build(inorder, postorder, start, inIdx - 1);
    return root;
 }
 

 class TreeNode
 {
   int val;
   TreeNode left;
   TreeNode right;
  
   TreeNode(int val)
   {
     this.val = val;
   }
 }
}
