public class NumberWithAlternateBits
{
   public boolean numberWithAlternateBits(int N)
   {
      if(N == 1) return true;

      int prevVal = 0;

      if( (N & 1) == 1) prevVal = 1;

      N >>=1;

      while(N != 0)
      {
        if(prevVal == (N & 1)) return false;

        if(prevVal == 1) prevVal = 0;
        else prevVal = 1;

        N >>=1;
      }
      return true;
   }
}
