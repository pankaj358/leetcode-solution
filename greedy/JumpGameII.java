
import java.util.Arrays;

public class JumpGameII
{
  public int solve(int []A)
  {
    int N = A.length;
    int[]dp = new int[N];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;

    for(int i = 0; i < N; i++)
    {
      for(int j = 1; j <= A[i]; j++)
      {
         if(i + j < N)
         {
            dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
         } 
         else
         {
           break;
         }
      }
    }

    return dp[N - 1]; 
  }

  public static void main(String[] args) 
  {
    JumpGameII jg = new JumpGameII();
    int A[]= {2, 3, 1, 1, 4};
    int actual = jg.solve(A);
    int expected = 2;

    System.out.println(actual == expected);
  }
}
