
import java.util.Arrays;


public class CountTeams
{
   public int countTeams(int []A)
   {
      int count = 0;
      int N = A.length;
      int dp[] = new int[N];

      for(int i = 0; i < N; i++)
      {
        for(int j = i; j >= 0; j--)
        {
           if(A[i] > A[j]) 
           {
             dp[i]++;
             count+=dp[j];
           }
        }
      }

     Arrays.fill(dp, 0);

     for(int i = 0; i < N; i++)
     {
       for(int j = i; j >= 0; j--)
       {
         if(A[i] < A[j])
         {
           dp[i]++;
           count +=dp[j];
         }
       }
     }
 
     return count;
    
   }
}
