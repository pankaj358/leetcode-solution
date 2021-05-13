public class NumberOfLongestIncreasingSubsequence
{
   public int solve(int []A)
   {
     int N = A.length;
     int lis[] = new int[N];
     int max = 1;
     
     for(int i=0; i < N; i++)
     {
       lis[i] = 1;
       for(int j = 0; j < i; j++)
       {
          if(A[i] > A[j])
          {
            lis[i] = Math.max(lis[i], lis[j] + 1);
            max = Math.max(max, lis[i]);
          }
       }
     }

     int lis2[] = new int[N];
     for(int i = 0; i < N; i++)
     {
        if(lis[i] == 1)
         lis2[i] = 1;
        else
        {
          for(int j = 0; j < i; j++)
          {
             if(lis[i] == lis[j] + 1 && A[i] > A[j])
             {
               lis2[i] = lis2[i] + lis2[j];
             }
          }
        }
     }

    int ans = 0;
    for(int i = 0; i < N; i++)
    {
      if(max == lis[i])
       {
          ans +=lis2[i];
       }
    }

    return ans;
    
   } 

   public static void main(String[] args)
   {
      NumberOfLongestIncreasingSubsequence tmp = new NumberOfLongestIncreasingSubsequence();
      int []A = {1, 3, 5, 4, 7};
      int actual = tmp.solve(A);
      int expected = 2;
      System.out.println(actual == expected);
   }
}
