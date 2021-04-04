
/**
*
*
*  problem link : https://leetcode.com/problems/trapping-rain-water/
*
*
*/


class TrappingRainWater
{
 
  public int solve(int[] A)
  {
   
   int lptr = 0;
   int rptr = 0;
 
   int leftMax = 0;
   int rightMax = 0;
   
   int ans = 0;

   while(lptr < rptr)
   {
      if(A[lptr] <= A[rptr])
      {
        if(A[lptr]>= leftMax)
         leftMax = A[lptr];
        else 
         ans+= leftMax - A[lptr];
       
        lptr++;
      }
      else
      {
        if(A[rptr] >= rightMax)
         rightMax = A[rptr];
        else
         ans+= rightMax - A[rptr];
        
        rptr--;
      }
   }

  return ans;

  }

}
