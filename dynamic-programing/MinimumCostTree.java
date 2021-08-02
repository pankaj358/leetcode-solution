import java.util.Stack;

public class MinimumCostTree {

  public int minimumCostTree(int []A) {
    int res = 0;

    Stack<Integer> stack = new Stack<>();
    stack.push(Integer.MAX_VALUE);
    
    for(int val : A) {
        while(stack.peek () <= val) {
          int mid = stack.pop();
          res += mid * Math.min(val, stack.peek());
       }
       stack.push(val);
    }

    while(stack.size() > 2) {
       res += stack.pop() * stack.peek();
     }

    return res;
  }

}
