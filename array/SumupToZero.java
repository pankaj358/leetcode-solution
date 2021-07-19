public class SumupToZero
{
  public int[] sumupToZero(int N)
  {
     int []A = new int[N];

     if( N == 1) return A;

     int idx = 0;
     if(N %2 != 0) idx = 1;

     for(; idx < N; idx +=2)
     {
       A[idx] = idx + 1;
       A[idx] = (-1 * A[idx]); 
     }

     return A;
  }
}
