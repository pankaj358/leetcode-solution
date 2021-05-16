public class MaximalRectangle
{
  public int maximalRectangle(int[][] matrix)
  {
     if(matrix.length == 0) return 0;
     
     int row = matrix.length;
     int col = matrix[0].length;

     int dp[] = new int[col];

     int ans = 0;
    
     for(int i = 0; i < row; i++)
     {
        for(int j = 0; j < col; j++)
        {
           if(matrix[i][j] == 0)
           {
             dp[j] = 0;
           }
           else
            {
              dp[j] += 1;
            }
        }
       
       int p = 0;
       int q = 0;
       int min = 0;

       for(p = 0; p < col; p++)
       {
          if(dp[p] == 0) continue;
          min = dp[p];
          ans = Math.max(ans, min); // vertical rectangle
          for( q = p + 1; q < col; q++)
          {
             if(dp[q] == 0) break;
             min = Math.min(min, dp[q]);
             ans = Math.max(ans, (q - p + 1) * min); // rectangle divided by zero
          }
           ans = Math.max(ans, (q-p) * min);
       }
        
     }
     return ans;
  }
  
  public static void main(String[] args)
  {
     MaximalRectangle obj = new MaximalRectangle();
     int[][]matrix = {{0, 0, 0}, {0, 0, 1}, {1, 0, 0}, {1, 0, 0}, {1, 1, 0}, {1, 0, 0}, {1, 1, 1}};
     int actual = obj.maximalRectangle(matrix);
     int expected = 5;
     System.out.println(actual == expected);
  }
}


