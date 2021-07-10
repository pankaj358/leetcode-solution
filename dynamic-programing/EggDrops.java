public class EggDrops
{

  int []dp = new int[100001];
 
  public int eggDrops(int N)
  {
     if(dp[N] == 0)
     for(int idx = 1; idx <= N; idx++)
      dp[N] = Math.min(dp[N] == 0 ? N : dp[N], 1 + Math.max(idx - 1, eggDrops(N - idx)));

     return dp[N];
  }
}
