
import java.util.List;
import java.util.ArrayList;

public class UniqueBSTII
{

  public List<TreeNode> generateTrees(int N)
  {
     return genList(1, N);
  }


  public List<TreeNode> genList(int start, int end)
  {
     List<TreeNode> list = new ArrayList<>();
     
      if(start > end) {
        list.add(null);
      }

     for(int idx = start; idx <= end; idx++)
     {
        List<TreeNode> leftTree = genList(start, idx - 1);
        List<TreeNode> rightTree = genList(idx + 1,  end);

        for(TreeNode left : leftTree)
        {
           for(TreeNode right : rightTree)
           {
              TreeNode root = new TreeNode(idx);
              root.left = left;
              root.right = right;
              list.add(root); 
           }
        }
     }
 
     return list;
  }


}

