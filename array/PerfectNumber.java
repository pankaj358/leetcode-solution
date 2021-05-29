public class PerfectNumber
{

  public int perfectNumber(int prime)
  {
    return  (1 << (prime - 1)) * ((1 << prime) - 1);
  }

  public boolean checkIfPerfectNumber(int N)
  {
     int []primes = {2, 3, 5, 7, 13, 17, 19, 31};
   
     for(int prime : primes)
     {
        if(perfectNumber(prime) == N)
         return true;
     }

     return false;
  }

}
