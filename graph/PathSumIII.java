public class PathSumIII
{

  public int pathSum(TreeNode root, int targetSum) { 
       if(root == null) return 0;
       
       return pathSumFrom(root, targetSum) +
              pathSum(root.left, targetSum) +
              pathSum(root.right, targetSum);    
  }

  public int pathSumFrom(TreeNode root, int targetSum){
      if(root == null) return 0;

      return (root.val == targetSum ? 1 : 0) + pathSumFrom(root.left, targetSum - root.val) + 
         pathSumFrom(root.right, targetSum - root.val);
  }

}
