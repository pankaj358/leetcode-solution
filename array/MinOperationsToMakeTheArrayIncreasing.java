public class MinOperationsToMakeTheArrayIncreasing
{
  public int minOperations(int []A)
  {
     int min = 0;

     for(int idx = 1; idx < A.length; idx++)
     {
        if(A[idx] <= A[idx - 1])
        {
           int t = A[idx-1] - A[idx] + 1;
           A[idx]+= t;
           min += t;
        }
     }

     return min;
  }
}
