public class WinnerCircularGame
{
   public int winnerCircularGame(int N, int k)
   {
      int winner = 0;
      
      for(int idx = 1; idx <= N; idx++)
      {
         winner = (winner + k) % idx;
      }

      return winner + 1;
   }
}
