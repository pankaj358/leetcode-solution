
import java.util.List;
import java.util.ArrayList;


public class PathSumII{

  public List<List<Integer>> pathSum(TreeNode root, int targetSum) { 
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    dfs(root, targetSum, res, path);
    return res;
  } 

  private void dfs(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> path){ 
     if(root == null) return;

     if(root.val == targetSum && root.left == null && root.right == null) {
        List<Integer> copy = new ArrayList<>(path);
        copy.add(root.val);
        return;
     }

     if(root.left != null){
       path.add(root.val);
       dfs(root.left, targetSum - root.val, res, path);
       path.remove(path.size() - 1);
     }

     if(root.right != null){
       path.add(root.val);
       dfs(root.right, targetSum - root.val, res, path);
       path.remove(path.size() - 1);
     }
  }
  
  class TreeNode {
     TreeNode left;
     TreeNode right;
     int val;
  }
}
