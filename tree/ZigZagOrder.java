import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

public class ZigZagOrder
{
   public List<List<Integer>> zigzag(TreeNode root)
   {
       List<List<Integer>> ans = new ArrayList<>();
       if(root == null)
        return ans;

       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
     
       boolean reverse = false;      
     
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

          if(reverse)
          {
            Collections.reverse(list);
            ans.add(list);
          }
          else
          {
            ans.add(list);
          }

          reverse = !reverse;
          
       }

       return ans;
   }
}
