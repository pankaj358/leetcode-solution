public class CountSetBits
{
  public int countSetBits(int N)
  {
    int count = 0;

    while(N != 0)
    {
      count++;
      N &= (N - 1);
    }

    return count;
  }
}
