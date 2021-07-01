public class MonotonicArray
{
  public boolean monotonic(int []A)
  {
     boolean increasing = true;
     boolean decreasing = false;

     for(int idx = 0; idx < A.length - 1; idx++)
     {
       if(A[idx] > A[idx + 1])
       {
         increasing = false;
       }
       if(A[idx] < A[idx + 1])
       {
         decreasing = false;
       }
     }
    
     return increasing || decreasing;
  }
}
