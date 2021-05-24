public class InterleavingString
{
   public boolean interleave(String s1, String s2, String s3)
   {
      int M = s1.length();
      int N = s2.length();

      if(M + N != s3.length()) return false;

      boolean dp[][] = new boolean[M + 1][N + 1];

       dp[0][0] = true;

      for(int idx = 1; idx <= M; idx++)
      {
        if(s1.charAt(idx - 1) != s3.charAt(idx - 1))
         dp[idx][0] = false;
        else 
         dp[idx][0] = dp[idx - 1][0];
      }

      for(int idx = 1; idx <= N; idx++)
      {
        if(s2.charAt(idx - 1) != s3.charAt(idx - 1))
          dp[0][idx] = false;
        else 
          dp[0][idx] = dp[0][idx - 1];
      }

      for(int i = 1; i <= M; i++)
      {
         for(int j = 1; j <= N; j++)
         {
            if(s1.charAt( i-1) == s3.charAt(i + j - 1) && s2.charAt(j - 1) != s3.charAt(i + j - 1))
            {
              dp[i][j] = dp[i - 1][j];
            }
            else if( s1.charAt(i - 1) != s3.charAt(i + j - 1) && s2.charAt(j  - 1) != s3.charAt(i + j - 1))
            {
              dp[i][j] = dp[i][j - 1];
            }
            else if(s1.charAt(i - 1) == s3.charAt(i + j - 1) && s2.charAt(j - 1) == s3.charAt(i + j - 1))
            {
              dp[i][j] = dp[i][j-1] || dp[i-1][j];
            }
            else
            {
              dp[i][j] = false;
            }
         }
      }

      return dp[M][N];
      
   }

   public boolean rec_interleave(String s1, String s2, String s3)
   {
      if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty()) return true;

      if(s3.isEmpty()) return false;

      if(s1.isEmpty() && s2.isEmpty()) return false;

      boolean first = false;

      boolean second = false;

      if(s1.isEmpty() == false && s1.charAt(0) == s3.charAt(0))
       first = rec_interleave(s1.substring(1), s2, s3.substring(1));

      if(s2.isEmpty() == false && s2.charAt(0) == s3.charAt(0))
       second = rec_interleave(s1, s2.substring(1), s3.substring(1));

      return first || second;
   }  
}
