public class MaximumGeneratedArray
{

  public int maximumGeneratedArray(int N)
  {
     if(N <= 1) return N;

     int max = 0;

     int A[] = new int[N + 1];
     A[1] = 1;
   
     for(int idx = 2; idx <= N; idx++)
     {
       if(idx % 2 == 1)
       {
         int div = idx / 2;
         A[idx] = A[div] + A[idx - div]; 
       }
       else
       {
         A[idx] = A[idx / 2];
       }

       max = Math.max(max, A[idx]);
     }

     return max;
   
  }

}
