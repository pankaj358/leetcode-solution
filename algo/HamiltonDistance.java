public class HamiltonDistance
{
  public int hamiltonDistance(int x, int y)
  {
    int xor = x ^ y;
    int dist = 0;

    while(xor != 0 )
    {
      dist += (xor ^ 1);
      xor >>= 1; 
    }

    return dist;
  }
}
