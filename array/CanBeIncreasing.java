public class CanBeIncreasing
{
  public boolean canBeIncreasing(int []A)
  {
     int flag = 1;

     for(int idx = 0; idx < A.length; idx++)
     {
       if(A[idx] > A[idx + 1])
       {
          if(flag == 0) return false;
          
          if(idx > 0)
          {
            if(A[idx + 1] <= A[idx - 1])
             A[idx + 1] = A[idx]; 
          }
         flag = 0;
       }
     }
     
     return true;
  }
}
