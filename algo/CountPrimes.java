
import java.util.Arrays;

public class CountPrimes
{

  public int countPrimes(int N)
  {
    boolean primes[] = new boolean[N];
    Arrays.fill(primes, true);  
    for(int idx = 2; idx < N; idx++ )
    {
       if(primes[idx] == true)
       {
          for(int nextIdx = 2; (nextIdx * idx) < N; nextIdx++)
          {
             primes[idx * nextIdx] = false; 
          }
       }
    }
  

    int count = 0;

    for(int idx = 2; idx < N; idx++)
    {
       if(primes[idx]) count++;
    }
    
    return count;
  }

  public static void main(String[] args) 
  {
    CountPrimes cntPrime = new CountPrimes();
    int ans = cntPrime.countPrimes(10);
    System.out.println(ans == 4);
  }
}
