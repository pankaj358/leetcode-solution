public class DistinctSubsequence {
 
   public int distinctSubsequence(String s, String t) {
      
     int N1 = s.length();
     int N2 = t.length();

     int []dp = new int[N2];

     dp[N2 - 1] = s.charAt(N2 - 1) == t.charAt(N1  - 1) ? 1 : 0;
     
     for(int idx = N2 - 2; idx >= 0; idx--) {
       dp[idx] = dp[idx + 1];
       if(s.charAt(idx) == t.charAt(N1 - 1)) dp[idx]++;
     }     

     int d = 1;

     for(int idx = N2 - 2; idx >= 0; idx--) {
       int []help = new int[2];
       for(int idx2 = N2 - d - 1; idx2 >= 0; idx2-- ) {
           help[idx2] = help[idx2 + 1];
           if(s.charAt(idx2) == t.charAt(idx)) help[idx2] += dp[idx2 + 1];  
        } 
        dp = help;
        d++;
     }

     return dp[0];

  }

}
