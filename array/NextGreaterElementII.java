import java.util.Stack;

public class NextGreaterElementII
{
  public int[] nextGreaterElement(int[] A)
  {
    Stack<Integer> stack = new Stack<>();

    int res[] = new int[A.length];   

    for(int idx = 2 * A.length - 1; idx >= 0; idx--)
    {
      if(!stack.isEmpty() && A[stack.peek()] <= A[idx % A.length]) 
       stack.pop();
 
      res[idx % A.length] = stack.empty() ? -1 : A[stack.peek()];
      stack.push(idx % A.length);
    }  

    return res;
  }
}
