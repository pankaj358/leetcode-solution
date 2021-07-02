import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class RightSideView
{
  public List<Integer> rightSideView(TreeNode root)
  {
     List<Integer> ans = new ArrayList<>();
     if(root == null) return ans;

     Queue<TreeNode> queue  = new LinkedList<>();
     queue.add(root);     
    
     while(queue.isEmpty() == false)
     {
       int size = queue.size();
       int last = -1;
       for(int idx = 0; idx < size; idx++)
       {
         TreeNode curr = queue.poll();
         if(curr.left != null) queue.add(curr.right);
         if(curr.right != null) queue.add(curr.right);
         last = curr.val;
       }
       ans.add(last);
     }
     return ans;
  }
  
  class TreeNode 
  {
    TreeNode left;
    TreeNode right;
    int val;
  } 
}
