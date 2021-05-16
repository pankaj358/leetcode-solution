public class MinCost
{
 
  public int solve(int [][] mat)
  {
    return cal(0, 0, mat.length - 1, mat[0].length - 1, mat);
  }

  private int cal(int i, int j, int m, int n, int[][] mat)
  {
     if(i == m && j == n) return mat[i][j];
     if(i > m || j > n) return Integer.MAX_VALUE;
     
      return mat[i][j] + Math.min(cal(i + 1, j, m, n, mat), cal(i, j + 1, m, n, mat));   
  }

  private int useMemo(int [][]cost)
  {
     int m = cost.length;
     int n = cost[0].length;
     int [][] memo = new int[m][n];

     for(int i = 0; i < n; i++)
      memo[0][i] = cost[0][i];

     for(int j = 1; j < m; j++)
      memo[j][0] = cost[j][0];    
     

     for(int i = 1; i < m; i++)
     {
        for(int j = 1; j < n; j++)
         {
            memo[i][j] = cost[i][j] + Math.min(memo[i-1][j], memo[i][j-1]);
         }
     }   

     return memo[m-1][n-1] + cost[0][0]; 

  }

  public static void main(String[] args)
  {
     MinCost min = new MinCost();
     int mat[][] = {{1, 3, 5, 8}, {4, 2, 1, 7}, {4, 3, 2, 3}};
     int ans = min.solve(mat);
     System.out.println(ans);
     int ans2 = min.useMemo(mat);
     System.out.println("Using Memo --------" + ans2);
  }

}
