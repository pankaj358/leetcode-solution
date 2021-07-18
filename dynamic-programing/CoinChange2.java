public class CoinChange2
{
   public int coinChange2(int []coins, int amount)
   {
     int [][]dp = new int[amount + 1][coins.length + 1];
     
     for(int i = 0; i <= coins.length; i++)
       dp[0][i] = 1;

     for(int i = 1; i<= amount; i++)
       dp[i][0] = 0;

     
     for(int i = 1; i <= amount; i++)
     {
       for(int j = 1; j <= coins.length; j++)
       {
          dp[i][j] = dp[i][j-1];
          if(i >= coins[j-1])
           dp[i][j] += dp[i-coins[j-1]][j]; 
       }
     }

     return dp[amount][coins.length];     

   }
}
