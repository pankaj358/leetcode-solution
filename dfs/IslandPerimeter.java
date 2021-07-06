public class IslandPerimeter
{

  private int matrix[][];
  int m;
  int n;

  int perimeter;


  private void dfs(int x, int y)
  {
     if(x < 0 || x >= m || y < 0 || y >= n)
     {
       perimeter++;
       return;
     }
    
     if(matrix[x][y] == 0)
     {
       perimeter++;
       return;
     }
     
     if(matrix[x][y] == 2) return;

     matrix[x][y] = 2;

     dfs(x-1, y);
     dfs(x, y - 1);
     dfs(x + 1, y);
     dfs(x, y + 1);
     
  } 


  public int perimeter(int [][] grid)
  {
     this.matrix = grid;
     m = grid.length; 
     n = grid[0].length;

    for(int x = 0; x < m; x++)
    {
      for(int y = 0; y < n; y++)
      {
         if(grid[x][y] == 1)
         {
           perimeter = 0;
           dfs(x, y);
         }     
      }
    }
    return perimeter;
  }
}
