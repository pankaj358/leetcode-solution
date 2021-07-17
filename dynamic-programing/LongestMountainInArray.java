import java.util.Arrays;

public class LongestMountainInArray
{
   public int longetMountainInArray(int []A)
   {
     int N = A.length;
     int []front = new int[N];
     int []back = new int[N];

     Arrays.fill(front, 1);
     Arrays.fill(back, 1);
    
     for(int i = 1; i < N; i++)
      if(A[i] > A[i-1]) front[i]+= front[i-1];
  
     
     int max = 0;

     for(int i = N-2;  i >= 0; i--)
     {
       if(A[i] > A[i + 1])  back[i] += back[i+1];

       if(front[i] > 1 && back[i] > 1) max = Math.max(max, front[i] + back[i] - 1);
     }

     return max;
   }
}
