import java.util.Arrays;

public class SievePrime
{
   
   boolean []primes = new boolean[10000];

   public void sieve()
   {
      Arrays.fill(primes, true);
      primes[0] = false;
      primes[1] = false;

      for(int idx = 2; idx < primes.length; idx++)
      {
        if(primes[idx])
        {
          for(int nextIdx = idx; (nextIdx * idx) < primes.length; nextIdx+=idx)
          {
            primes[nextIdx] = false;
          }
        }
      }
   }
}
