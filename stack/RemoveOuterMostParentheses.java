import java.util.Stack;


public class RemoveOuterMostParentheses 
{
  public String removeOutermostParentheses(String s) {
       Stack<Character> stack = new Stack<>();
       String str = "";
       String ans = "";
       for(int idx = 0; idx < s.length(); idx++){
         if(s.charAt(idx) == '(')
           stack.push('(');
         else 
           stack.pop();

         str += s.charAt(idx);

         if(stack.isEmpty()){
          ans += str.substring(1, str.length() - 1);
          str = "";
         }
       }

      return ans;
   }
}
