public class UniqueBST
{

  public int uniqueBST(int N)
  {
    int []dp = new int [N + 1];
    
    dp[0] = 1;
    dp[1] = 1;

    for(int i = 2; i <= N; i++)
    {
       for(int j = 1; j <= i; j++)
       {
         dp[i] += dp[j - 1] * dp[i - j];
       }
    }

    return dp[N];
   
  }

}
