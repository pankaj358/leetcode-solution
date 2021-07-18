import java.util.Stack;

public class MinimumAddToValidParenthesis
{
   public int minimumAdd(String s)
   {
      Stack<Character> stack = new Stack<>();
   
      int ans = 0;
      
      for(char ch : s.toCharArray())
      {
         if(ch == '(')
         {
           stack.push(ch);
         }
         else
         {
            if(stack.isEmpty() == false)
              stack.pop();
            else ans++;
         }
      }

      return ans + stack.size();
   }
}
