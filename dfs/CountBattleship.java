public class CountBattleship
{
  public int countBattleship(int [][]board)
  {
    int count = 0;

     for(int row = 0; row < board.length ; row++)
     {
       for(int col = 0; col < board[0].length; col++)
       {
          if(board[row][col] == 'X')
          {
             if(board[Math.max(0, row-1)][col] != 'O' && board[row][Math.max(0, col - 1)] != 'O')
               count++;
           
             board[row][col] = 'O';
          }
       }
     }
   
     return count;
  }
}
