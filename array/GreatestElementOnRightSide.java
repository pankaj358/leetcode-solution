public class GreatestElementOnRightSide
{
  public int[]  greatestElementOnRightSide(int []A)
  {
     int currMax = -1;
     for(int idx = A.length -1; idx >= 0; idx--)
     {
       int tmp = A[idx];
       A[idx] = currMax;
       currMax = Math.max(currMax, tmp);
     }

     return A;
  }
}
