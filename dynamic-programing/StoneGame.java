public class StoneGame
{
  public boolean stoneGame(int[] piles)
  {
    int sum1 = 0;
    int sum2 = 0;

    for(int i  = 0; i < piles.length; i++)
    {
       if((i & 1) == 0)
       {
          sum1 += piles[i];
       }
       else 
       {
          sum2 += piles[i];
       }
    }

    return sum1 != sum2;
  }
}
