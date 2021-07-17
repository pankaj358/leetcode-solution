import java.util.Arrays;

public class MakeMountainArray
{
  public int minimumMountainRemovals(int []A)
  {
     int N = A.length;
     int max = 0;

     int []front = new int[N];
     int []back  = new int[N];


      Arrays.fill(front, 1);
      Arrays.fill(back, 1);
     
     for(int i = 0; i < N; i++)
     {
        for(int j = 0; j < i; j++)
        {
           if(A[i] > A[j]) 
           {
             front[i] = Math.max(front[i], front[j] + 1);
           }
        }
     }

     for(int i = N -1; i >= 0; i--)
     {
        for(int j = N -1; j > i; j--)
        {
          if(A[i] > A[j])
          {
            back[i] = Math.max(back[i], back[j] + 1);
          }  
        }

        if(front[i] > 1 && back[i] > 1)
         max = Math.max(max, front[i] + front[i] - 1);
     }

     return N - max;
   
  }
}
