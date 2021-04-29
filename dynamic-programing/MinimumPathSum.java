
import java.util.Arrays;

public class MinimumPathSum
{
 
  private int[][] dp;

   public int minimumPathSum(int [][] grid)
   {
      int m = grid.length;
      int n = grid[0].length;
     
      dp = new int[m + 1][ n + 1 ];     

      for(int i = 0; i  <= m; i++)
       Arrays.fill(dp[i], -1);

      return count(0, 0, m - 1, n - 1, grid);
   }


   private int count(int i, int j, int m, int n, int[][] grid)
   {
      if(dp[i][j] != -1)  return dp[i][j];
      
      if(i == m && j == n)  return grid[i][j];

      if(i > m || j > n) return Integer.MAX_VALUE;

      int ans = Math.min(count(i + 1, j, m, n, grid), count(i, j + 1, m, n, grid));
      
      dp[i][j] = ans + grid[i][j];

      return dp[i][j]; 
   }

   public static void main(String[] args)
   {
      MinimumPathSum ms = new MinimumPathSum();
      int [][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
           
      int ans = ms.minimumPathSum(grid);
      System.out.println(ans);
      
      int[][] grid1 = {{1, 2, 3}, {4, 5, 6}};
      
      ans = ms.minimumPathSum(grid1);
      
      System.out.println(ans); 
      
             
 
   } 

}
