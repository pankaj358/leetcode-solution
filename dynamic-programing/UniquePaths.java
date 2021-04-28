
import java.util.Arrays;

public class UniquePaths
{
  
 private int[][] memo;

  public int uniquePaths(int m, int n)
  {
     memo = new int[m + 1][n + 1];
   
     for(int i = 0; i < m; i++)
      Arrays.fill(memo[i], -1);    
  
     return count(m - 1, n - 1, 0, 0);
  }

  private int count(int m, int n, int i, int j)
  {
     if(memo[i][j] != -1)
        return memo[i][j];

     if(i == m && j == n) return 1;
    
     if(i > m || j > n) return 0;

     memo[i][j] = count(m, n, i + 1, j) + count(m, n, i , j + 1);
     
     return memo[i][j];
  }

   public static void main(String[] args)
   {
      UniquePaths unique = new UniquePaths();
      int ans = unique.uniquePaths(9, 9);
      System.out.println(ans);
   }
}
