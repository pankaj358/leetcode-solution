public class CoinChange
{
  public int coinChange(int []coins, int amount)
  {
    if(amount == 0 ) return 0;
    
    int dp[] = new int[amount + 1];
  
    for(int i = 1; i <= amount; i++) 
       dp[i] = i;

    for(int i = 1; i <= amount; i++)
    {
      int min = 999999;
      for(int j = 0; j < coins.length; j++)
      {
         if(amount - coins[j] < 0) continue;
         
         min = Math.min(min, dp[i - coins[j]]);
      }
      dp[i] = min + 1;
    }

    if(dp[amount] >= 999999) return -1;

    return dp[amount];
  }
}
