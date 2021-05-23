
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;


public class LevelOrderII
{

  public List<List<Integer>> levelOrderII(TreeNode root)
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
       ans.add(list);
    }    
   
    Collections.reverse(ans);
    return ans; 
 
  }   

}
