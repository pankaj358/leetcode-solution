public class SmallestRangeI
{
   public int smallestRange(int []A, int k)
   {
     if(A.length == 1) return k;

     int min = A[0];
     int max = A[0];

     for(int idx = 1; idx < A.length; idx++)
     {
       min = Math.min(min, A[idx]);
       max = Math.max(max, A[idx]);
     }

     return Math.max(0, (max - k) - (min + k));
   }
}
