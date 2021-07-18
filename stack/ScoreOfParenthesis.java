import java.util.Stack;

public class ScoreOfParenthesis
{
  public int score(String str)
  {
    Stack<Integer> stack = new Stack<>();
    stack.push(0);

    for(char ch : str.toCharArray())
    {
      if(ch == '(')  stack.push(0);
      else
       {
          int v = stack.pop();
          int w = stack.pop();
          stack.push(w + Math.max(1, 2 * v));
       }
    }
  
     return stack.pop();
  }
}
