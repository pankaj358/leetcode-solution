public class MaximumSubarray
{

  public int solve(int[] A)
  {
    int maxSoFar = Integer.MIN_VALUE;
    int maxTillNow = 0;
  
     for(int i = 0; i < A.length; i++)
     {
        maxTillNow+= A[i];
       
        maxSoFar = Math.max(maxSoFar, maxTillNow);
        maxTillNow = Math.max(maxTillNow, 0);
     }

     return maxSoFar;
  }

  public static void main(String[] args)
  {
    int []A = {-2,1,-3,4,-1,2,1,-5,4};
    
    MaximumSubarray maxSub = new MaximumSubarray();
    int ans = maxSub.solve(A);
    System.out.println(ans);    

  }

}
