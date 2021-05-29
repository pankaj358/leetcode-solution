public class LongestPalindromicSubSequence
{
  int memo[][];
  public int longestPalindromicSubsequence(String str)
  {
     int N = str.length();
     memo = new int[N][N];

     return count(str, 0, N - 1);
  }

  private int count(String str, int l, int r)
  {
     if(l > r) return 0;
     if(l == r) return 1;

     if(str.charAt(l) == str.charAt(r))
      memo[l][r] = 2 + count(str, l + 1, r - 1);
     else memo[l][r] = Math.max(count(str, l + 1, r ), count(str, l, r - 1));

     return memo[l][r]; 
     
  }
}
