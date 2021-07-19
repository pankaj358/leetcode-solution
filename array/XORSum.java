public class XORSum
{
  public int xorSum(int []A)
  {
    int res = 0;
    
    for(int val : A)
     res |= val;

    return res * (1 << A.length - 1);
  }
}
