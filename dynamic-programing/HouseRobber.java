public class HouseRobber
{
   public int rob(int []A){
   
     int N = A.length;

     if(N == 1) return A[0];

     if(N == 2) return Math.max(A[0], A[1]);

     int []dp = new int[N];

     dp[0] = A[0];
     dp[1] = Math.max(dp[0], A[1]);
    
     for(int i = 2; i < N; i++)
     {
       dp[i] = Math.max(dp[i - 2] + A[i], dp[i-1]);
     }
   
     return dp[N - 1];   
 
   }

  
   private int rob(int A[], int idx)
   {
     if(idx < 0) return 0;

     // rob current home | or do not rob
     return Math.max(A[idx] + rob(A, idx - 2), rob(A, idx - 1));
   }

}
