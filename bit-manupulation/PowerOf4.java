public class PowerOf4
{
  public boolean powerOf4(int N)
  {
    return N > 0 && (N & (N-1) ) == 0 && ( N & 0x55555555 ) != 0;
  }
}
