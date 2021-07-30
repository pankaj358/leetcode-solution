public class DeleteLeaves {
 
 class TreeNode {
   TreeNode left;
   TreeNode right;
   int val;
 }  
 
 public TreeNode delete(TreeNode root, int target ) {
    if(root == null) return null;

    if(root.val == target && root.left == null && root.right == null) 
     return null;

    TreeNode left = delete(root.left, target);
    TreeNode right = delete(root.right, target);

    if(left == null && right == null && root.val == target) return null;
   
    return root;
 }
}
