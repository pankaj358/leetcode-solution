public class SurroundedRegions
{


  public void surroundedRegions(char[][] board)
  {
    if(board == null || board[0].length == 0)
     return;
  
    int m = board.length;
    int n = board[0].length;

    for(int i = 0; i < n; i++)
    {
      if(board[0][i] == 'O') 
        dfs(0, i, m, n, board);

      if(board[m-1][i] == 'O')
        dfs(m-1, i, m, n, board);
    }

    for(int i = 0; i < m; i++)
    {
       if(board[i][0] == 'O') 
        dfs(i, 0, m, n, board);
  
       if(board[i][n-1] == 'O')
        dfs(i, n-1, m, n, board);
    }

    for(int i = 0; i < m; i++)
    {
      for(int j = 0; j < n; j++)
      {
        if(board[i][j] == 'O') 
           board[i][j] = 'X';

        if(board[i][j] == '1')
           board[i][j] = 'O';
      }
    }
   
  }

  
  private void dfs(int row, int col, int m, int n, char [][] board)
  {
     if(row < 0 || row >= m || col < 0 || col >= n) return ;

     if(board[row][col] == 'X' || board[row][col] == '1') return;

     board[row][col] = '1';

     dfs(row + 1, col, m, n, board);
     dfs(row - 1, col, m, n, board);
     dfs(row, col + 1, m, n, board);
     dfs(row, col - 1, m, n, board);
  }

}
