import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;


public class AllPossibleFullBinaryTree
{

   Map<Integer, List<TreeNode>> memo = new HashMap<>();


   public List<TreeNode> allPossible(int N)
   {
      if(memo.containsKey(N) == false)
      {
         List<TreeNode> ans = new LinkedList<>();  
        
         if(N == 1)
         {
            ans.add(new TreeNode(0));
         }
         else if( N % 2 == 1)
         {
            for(int x = 0; x < N; x++)
            {
               int y = N - x - 1;
               
               for(TreeNode left : allPossible(x))
               {
                 for(TreeNode right : allPossible(y))
                 {
                    TreeNode fbt = new TreeNode(0);
                    fbt.left = left;
                    fbt.right = right;
                    ans.add(fbt);
                 }
               }
            }
         }
         memo.put(N, ans);
      }
      return memo.get(N);
   }

   class TreeNode
   {
     TreeNode left;
     TreeNode right;
     int val;
     TreeNode(int val) {
           this.val = val;
       }
   }
}
