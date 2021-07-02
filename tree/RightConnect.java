import java.util.Queue;
import java.util.LinkedList;


public class RightConnect
{

  public TreeNode connect(TreeNode root)
  {
     if(root == null) return;
     
     Queue<TreeNode> queue = new LinkedList<>();
     queue.add(root);

     while(queue.isEmpty() == false)
     {
       TreeNode prev = null;
       int size = queue.size();
       for(int idx = 0; idx < size; idx++)
       {
         TreeNode curr = queue.poll();
         if(curr.left != null)
           queue.add(curr.left);
         if(curr.right != null)
           queue.add(curr.right);
        
         if(prev != null)
             prev.next = curr;

         prev = curr; 
       }
     }
  
     return root;
    
  }

 
  class TreeNode
  {
    TreeNode left;
    TreeNode right;
    TreeNode next;
    int val;
  }
}
