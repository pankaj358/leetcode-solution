public class PartitionArrayMaxSum
{
   public int maxSum(int []A, int K)
   {
     int N = A.length;
     int []dp = new int[N + 1];
    
     for(int i = 1; i <= N; i++)
     {
        int currMax = 0;
        int best = 0;

        for(int k = 1; k <= K && i - k >= 0; k++)
        {
           currMax = Math.max(currMax, A[i-k]);
           best = Math.max(best, currMax * k + dp[i-k]);
        }

        dp[i] = best;
     }
  
     return dp[N];  
   }
}
