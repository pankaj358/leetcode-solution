import java.util.List;
import java.util.ArrayList;

public class AverageLevelsInBT
{
  public List<Double> averageLevels(TreeNode root)
  {
     List<Double> sum = new ArrayList<>();
     List<Integer> count = new ArrayList<>();
     average(root, 0, sum, count);

     for(int idx = 0; idx < sum.size(); idx++)
       sum.set(idx, sum.get(idx)/count.get(idx));
     
     return sum;
  }


 private void average(TreeNode root, int idx, List<Double> sum, List<Integer> count)
 {
     if(root == null) return ;

     if(idx < sum.size())
     {
       sum.set(idx, sum.get(idx) + root.val);
       count.set(idx, count.get(idx) + 1);
     }
     else
     {
       sum.add(1.0 * root.val);
       count.add(1);
     }

     average(root.left, idx + 1, sum, count);
     average(root.right, idx + 1, sum, count);
 }


  class TreeNode
  {
    TreeNode left;
    TreeNode right;
    int val;
  }
}
