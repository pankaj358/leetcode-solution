
import java.util.Arrays;

public class UniquePathsII
{

  int [][]dp;

  public int uniquePath(int [][] grid)
  {
      dp = new int[grid.length + 1][grid[0].length + 1];

      for(int i = 0; i < dp.length; i++)
       Arrays.fill(dp[i], -1);     
 
      return count(grid.length - 1, grid[0].length - 1, 0, 0, grid);
  }

  private int count(int m, int n, int i, int j, int[][]grid)
  {
    
     if(dp[i][j] != -1)
        return dp[i][j];     

     if(m == i && n == j && grid[i][j] == 0) return 1;

     if(i > m || j > n || grid[i][j] == 1)  return 0;
  
     dp[i][j] = count(m, n, i + 1, j, grid) + count(m, n, i, j + 1, grid);
 
     return dp[i][j];
  }

  public static void main(String[] args)
  {
     UniquePathsII uq = new UniquePathsII();
     int [][]A = {{0, 1}, {0, 0}};
     int ans = uq.uniquePath(A);
      System.out.println(ans);
  }

}
