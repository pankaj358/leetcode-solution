import java.util.List;
import java.util.ArrayList;


public class LeafSimilarTrees
{
  public boolean leafSimilarTrees(TreeNode root1, TreeNode root2)
  {
     List<Integer> leaves1 = new ArrayList<>();
     List<Integer> leaves2 = new ArrayList<>();

     dfs(root1, leaves1);
     dfs(root2, leaves2);

     return leaves1.equals(leaves2);
  }
  
  private void dfs(TreeNode root, List<Integer> leaves)
  {
     if(root == null) return;

     if(root.left == null && root.right == null)
       leaves.add(root.val);

     dfs(root.left, leaves);
     dfs(root.right, leaves);
  }

  class TreeNode
  {
    TreeNode left;
    TreeNode right;
    int val;
  }
}
