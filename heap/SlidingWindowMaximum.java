import java.util.Deque;
import java.util.ArrayDeque;

public class SlidingWindowMaximum
{

   public int[] slidingWindowMaximum(int A[], int k)
   {
      if( A == null || k <= 0)
      {
         return new int[0];
      }

      int N = A.length;
      int []result = new int[N - k + 1];
      int resultIdx = 0;

      Deque<Integer> deque = new ArrayDeque<>();

      for(int idx = 0; idx < N; idx++)
      {
        while(deque.isEmpty() == false && deque.peek() < idx - k + 1) 
          deque.poll();

        while(deque.isEmpty() == false && A[deque.peekLast()] < A[idx])
          deque.pollLast();

        deque.offer(idx);
        
        if( idx >= k - 1)
         result[resultIdx] = A[deque.peek()];
      }
    
      return result;  
   }
   
}
