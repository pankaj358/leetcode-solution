public class PowerOf2
{
  public boolean isPowerOf2(int N)
  {
     if( N <= 0) return false;

     return !((N & (N - 1)) > 0);
  }
}
