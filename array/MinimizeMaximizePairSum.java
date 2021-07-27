import java.util.Arrays;

public class MinimizeMaximizePairSum
{
   public int minimizeMaximizePairSum(int []A)
   {
      Arrays.sort(A);
      int l = 0;
      int r = A.length; 
      
      int ans = Integer.MIN_VALUE;  

      while(l < r)
      {
        int sum = A[l]  + A[r];
        r--;
        l++;
        ans = Math.max(ans, sum);
      }

      return ans;
   }
}
