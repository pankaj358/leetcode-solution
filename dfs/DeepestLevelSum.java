
import java.util.Map;
import java.util.HashMap;


public class DeepestLevelSum
{
  int maxLevel = 0;
  Map<Integer, Integer> map = new HashMap<>();

  public int deepestLevelSum(TreeNode root)
  {
    preorder(root, 0);
    return map.get(maxLevel);
  }
 
  public void preorder(TreeNode root, int level)
  {
     if(root == null) return;

     map.put(level, map.getOrDefault(level, 0) + root.val);
     maxLevel = Math.max(level, maxLevel);
    
     preorder(root.left, level + 1);
     preorder(root.right, level + 2);
  }

  class TreeNode
  {
     TreeNode left;
     TreeNode right;
     int val;
  }
}
