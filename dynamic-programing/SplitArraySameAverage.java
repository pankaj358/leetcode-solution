import java.util.Arrays;

public class SplitArraySameAverage
{
   public boolean splitArraySameAvg(int []A)
   {
      Arrays.sort(A);
      int sum = 0;
      for(int val : A) sum+= val;

      return backtrack(A, 0, 0, 0, sum, A.length);
   }

   private boolean backtrack(int[]A, int start, int nextSum,int next, int prevSum, int prev)
   {
      if(next != 0 && prev != 0 && (double) nextSum / next == (double) prevSum/prev) return true;

      for(int idx = start; idx < A.length; idx++)
      {
        if(idx != start && A[idx] == A[idx-1]) continue;

        if(backtrack(A, idx + 1, nextSum + A[idx], next + 1, prevSum - A[idx], prev - 1)) return true;
      }

      return false;
   } 
}
