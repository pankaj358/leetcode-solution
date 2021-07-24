public class MakeArrayEqual
{
  public int makeArrayEqual(int N)
  {
    if(N % 2 == 1)
    {
      N = N / 2;
      return N * (N + 1);
    }

    N = N / 2;

    return N * N;
  }
}
