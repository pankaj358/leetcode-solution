public class BuildBSTUsingSortedArray
{

   public TreeNode build(int[] A)
   {
      return build(A, 0, A.length - 1);
   }

   private TreeNode build(int[]A, int low, int high)
   {
      if(low > high) return null;

      int mid = (low + high) / 2;

      TreeNode root = new TreeNode(A[mid]);
      root.left = build(A, low, mid - 1);
      root.right = build(A, mid + 1, high);
     
      return root;
   }

}
