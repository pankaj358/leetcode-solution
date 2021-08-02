public class TribonnaciNumber {

 public int tribonnaciNumber(int N) {
     if(N == 0) return 0;
  
     if(N < 3) return 1;

     int dp[] = new int[N + 1];
 
     dp[1] = 1;
     dp[2] = 1;

     for(int idx = 3; idx <= N; idx++) {
        dp[idx] = dp[idx - 1] + dp[idx - 2] + dp[idx - 3];
     }

     return dp[N];
  }

}
