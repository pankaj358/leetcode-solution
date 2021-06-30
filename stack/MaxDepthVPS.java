import java.util.Stack;

public class MaxDepthVPS
{
   public int maxDepth(String str) 
   {
      int ans = 0;
      Stack<Character> stack = new Stack<>();
      for(int idx = 0; idx < str.length(); idx++)
      {
         if('(' == str.charAt(idx)) 
         {
           stack.push('(');
         }
         else if(')' == str.charAt(idx)) 
         {
           ans = Math.max(ans, stack.size());
           stack.pop();
         }
      }

     return ans;
   }
}
