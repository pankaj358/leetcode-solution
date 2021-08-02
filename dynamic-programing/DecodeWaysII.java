public class DecodeWaysII {

  int M = 1_000_000_007;

  public int decodeWays(String str) {
     long []dp = new long[str.length() + 1];

     dp[0] = 1;
     dp[1] = str.charAt(0) == '*' ? 9 : str.charAt(0) == '0' ? 0 : 1;

     for(int idx = 1; idx < str.length(); idx++) {
      if(str.charAt(idx) == '*') {
         dp[idx + 1] = 9 * dp[idx] % M;
         if(str.charAt(idx - 1) == '1')
           dp[idx + 1] = (dp[idx + 1] + 9 * dp[idx - 1]) % M;
         else if(str.charAt(idx - 1) == '2') 
           dp[idx + 1] = (dp[idx + 1] + 6 * dp[idx - 1]) % M;
         else if(str.charAt(idx - 1) == '*') 
           dp[idx + 1] = (dp[idx + 1] + 15 * dp[idx - 1]) % M;
       }
       else {
           dp[idx + 1] = str.charAt(idx) != '0' ? dp[idx] : 0;
           if(str.charAt(idx - 1) == '1') 
              dp[idx + 1] = (dp[idx + 1] + dp[idx - 1]) % M;
           else if(str.charAt(idx  - 1) == '2' && str.charAt(idx) <= '6')
              dp[idx + 1] = (dp[idx + 1] + dp[idx - 1]) % M;
           else if(str.charAt(idx - 1) == '*') 
              dp[idx + 1] = (dp[idx + 1] + (str.charAt(idx) <= '6' ? 2 : 1) * dp[idx - 1]) % M;  
       }
     }

     return (int) dp[str.length()];
  }

}
