
import java.util.Stack;

public class LongestValidParentheses
{

  public int longestValidParentheses(String str)
  {
    int maxans = 0;
    Stack<Integer> stack = new Stack<>();

    // to avoid empty stack exception
    stack.push(-1);
   
    for(int i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) == '(')
      {
        stack.push(i);
      }
      else
      {
        stack.pop();
  
        if(stack.isEmpty())
        {
          stack.push(i);
        }
        else
        {
          maxans = Math.max(maxans, i - stack.peek());
        }
      }
    }

    return maxans;
  }
  
  public static void main(String[] args)
  {
     LongestValidParentheses lvp = new LongestValidParentheses();
     int ans = lvp.longestValidParentheses("((())");
     System.out.println(ans);
  }
 
}
