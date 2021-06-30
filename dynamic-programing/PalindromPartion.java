
import java.util.List;
import java.util.ArrayList;


public class PalindromPartion {

  public List<List<String>> partion(String s) {
    int N = s.length();
    boolean [][] dp = new boolean[N][N]; 
    List<List<String>> result = new ArrayList<>(); 
    dfs(result, s, 0,new ArrayList<>(), dp);
    return result; 
  }

  private void dfs(List<List<String>> result, String s, int start, List<String> currList, boolean[][] dp){
      if(start >= s.length()) result.add(new ArrayList<>(currList));
   
      for(int end = start; end < s.length(); end++) {
        if(s.charAt(start) == s.charAt(end) && (end - start <= 2 || dp[start + 1][end - 1])) {
            dp[start][end] = true;
            currList.add(s.substring(start, end + 1));
            dfs(result, s, end + 1, currList, dp);
            currList.remove(currList.size() - 1);
         }
      } 
         
  }

}
