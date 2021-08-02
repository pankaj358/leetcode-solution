public class DecodeWays {

  public int decodeWays(String str) {
   
    int N = str.length() + 1;

    int []dp = new int[N];

    dp[0] = 1;
    dp[1] = str.charAt(0) == '0' ? 0 : 1;

    for(int idx = 2; idx < N; idx++) {
      int oneDigit = Integer.valueOf(str.substring(idx - 1, idx ));
      int twoDigit = Integer.valueOf(str.substring(idx - 2, idx ));

      if(oneDigit > 0) dp[idx] += dp[idx - 1];
   
      if(twoDigit >= 10 && twoDigit <= 26) dp[idx]+= dp[idx - 2];
    }

    return dp[N - 1]; 
  }

}
