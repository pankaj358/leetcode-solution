import java.util.Stack;

public class RemoveAllAdjacentCharacter
{
  public String removeAllAdjacentCharacter(String str)
  {
     Stack<Character> stack = new Stack<>();
     for(int idx = 0; idx < str.length(); idx++){
         if(stack.isEmpty() || stack.peek() != str.charAt(idx))
           stack.push(str.charAt(idx));
         else stack.pop();
     }

     StringBuilder sb = new StringBuilder();
     while(stack.isEmpty() == false)
       sb.append(stack.pop());

    return String.valueOf(sb.reverse());
  }
}
