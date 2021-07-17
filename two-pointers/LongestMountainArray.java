public class LongestMountainArray
{
  public int longestMountainArray(int A[])
  {
    int N = A.length;
    int ans = 0;
    int base = 0;
 
    while( base < N)
    {
       int end = base;
      
       if(end + 1 < N && A[end] < A[end + 1])
       {
         while( end + 1 < N && A[end] < A[end + 1]) end++;

         if(end + 1 < N && A[end] > A[end + 1])
         {
            while(end + 1 < N  && A[end] > A[end + 1]) end++;

            ans = Math.max(ans, end - base + 1);
         }
       }

       base = Math.max(end, base + 1);  
    }

    return ans;
  }
}
