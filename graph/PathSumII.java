
import java.util.List;
import java.util.ArrayList;

public class PathSumII
{
  public List<List<Integer>> pathSum(TreeNode root, int targetSum){
     List<List<Integer>> ans = new ArrayList<>();
     List<Integer> path = new ArrayList<>();
     dfs(ans, path, targetSum, root);
     return ans;
  }

   public void dfs(List<List<Integer>> res, List<Integer> path, int targetSum, TreeNode root){
          
       if(root == null) return;       
       path.add(root.val);
       
       if(root.left == null && root.right == null)
       {
         if(root.val == targetSum)
            res.add(new ArrayList<>(path));
         return;
       }

       if(root.left != null){
          dfs(res, path, targetSum - root.val, root.left);
          path.remove(path.size()  - 1);
       }

       if(root.right != null){
          dfs(res, path, targetSum - root.val, root.right);
          path.remove(path.size() - 1);
       }

    } 
}
