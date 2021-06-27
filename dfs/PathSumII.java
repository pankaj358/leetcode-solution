
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
    
     path.add(root.val);

     if(root.left == null && root.right == null){
        if(root.val == targetSum) res.add(new ArrayList<>(path));
        return;
     }    

     if(root.left != null){
       dfs(root.left, targetSum - root.val, res, path);
       path.remove(path.size() - 1);
     }

     if(root.right != null){
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
