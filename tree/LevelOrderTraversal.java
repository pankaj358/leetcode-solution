
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;


public class LevelOrderTraversal
{

  public List<List<Integer>> levelOrder(TreeNode root)
  {
     List<List<Integer>> ans = new ArrayList<>();
     
     if(root == null)
        return ans;

     Queue<TreeNode> queue = new LinkedList<>();
     queue.add(root);

     while(queue.isEmpty() == false)
     {
        int size = queue.size();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < size; i++)
        {
           TreeNode t = queue.poll();
           list.add(t.val);
         
           if(t.left != null)
             queue.add(t.left);
          
           if(t.right != null)
             queue.add(t.right);
        }
     }

    return ans;
   
  }

}
