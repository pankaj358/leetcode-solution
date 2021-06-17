public class SumOfDigitsBase
{
  public int sumOfDigitsInBaseK(int N, int k)
  {
    int res = 0;
    while( N > 0)
     {
        res += N % k;
        N /= k;
     }

     return res;
  }
}
