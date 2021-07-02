public class ContainerWithMostWater
{
  public int containerWithMostWater(int []A)
  {
    int N = A.length;

    int lptr = 0;
    int rptr = N - 1;

    int ans = 0;

    while(lptr < rptr)
    {
      int minHeight = Math.min(A[lptr], A[rptr]);
      int dist = rptr - lptr;
      ans = Math.max(ans, dist * minHeight);

      if(A[lptr] < A[rptr])
      {
        lptr++;
      }
      else 
      {
        rptr--;
      }
    }
  
    return ans;
  }
}
