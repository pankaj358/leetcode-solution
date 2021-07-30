import java.util.List;
import java.util.ArrayList;

public class BalanceBinarySearchTree {

  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int val) {
        this.val = val;
     }
  }

   public TreeNode balanceBST(TreeNode root) {
      if(root == null || (root.left == null && root.right == null)) return root;
      
      List<Integer> sortedList = new ArrayList<>();
      inorder(root, sortedList);
      
      return createBST(sortedList, 0, sortedList.size() - 1); 
      
   }

   private TreeNode createBST(List<Integer> sortedList, int start, int end) {
        if(start > end) return null;

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(sortedList.get(mid));
        root.left = createBST(sortedList, start, mid - 1);
        root.right = createBST(sortedList, mid + 1, end);
        return root;
   }

   private void inorder(TreeNode root, List<Integer> list) {
      if(root == null) return;

      inorder(root.left, list);
      list.add(root.val);
      inorder(root.right, list);
   }
}
