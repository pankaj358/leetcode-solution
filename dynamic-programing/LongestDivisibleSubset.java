
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LongestDivisibleSubset
{

  public List<Integer> solve(int []A)
  {
    List<Integer> ans = new ArrayList<>();    
    int N = A.length;
    if(N == 0) return ans;
    Arrays.sort(A);   
    int lis[] = new int[N];    
    lis[0] = 1;
   
    int maxCnt = 1;

    for(int i = 1; i < N; i++)
    {
       lis[i] = 1;
       for(int j = 0; j < i; j++)
       {
          if(A[i] % A[j] == 0)
          {
             lis[i] = Math.max(lis[i], lis[j] + 1);
             maxCnt = Math.max(maxCnt, lis[i]);
          }
       }
    }
   
    int maxEle = -1;

    for(int i = N - 1; i >= 0; i--)
    {
      if(lis[i] == maxCnt) 
      {
         if(maxEle == -1 || maxEle % A[i] == 0)
         {
           maxCnt--;
           ans.add(A[i]);
           maxEle = A[i]; 
         }
      }
    }
    return ans;
  }

  public static void main(String[] args)
  {
     LongestDivisibleSubset lds = new LongestDivisibleSubset();
     int []A = {4, 8, 10, 2048};
     List<Integer> ans = lds.solve(A);
     ans.stream().forEach(System.out::println);
  }

}
