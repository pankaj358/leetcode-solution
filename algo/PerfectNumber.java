public class PerfectNumber
{
   public boolean checkIfPerfectNumber(int N)
   {
      int[] primes = {2, 3, 5, 7, 13, 17, 19, 31};
      
      for(int prime : primes)
      {
        if(perfectNumber(prime) == N) return true;
      }
      return false;      
   }

   private int perfectNumber(int p)
   {
      return (1 << (p - 1)) * ((1 << p) - 1);
   }
}
