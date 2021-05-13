
import java.util.Arrays;

public class MaximumLengthOfPairChain
{
  
  class Pair implements Comparable<Pair> {
    int left;
    int right;
    Pair(int left, int right)
    {
      this.left = left;
      this.right = right;
    }

    public int compareTo(Pair pair)
    {
      return this.right - pair.right;
    }
  }

   public int solve(int [][]A)
   {
     int N = A.length;
     Pair pairs[] = new Pair[N];

     for(int i = 0; i < N; i++)
     {
        Pair pair = new Pair(A[i][0], A[i][1]);
        pairs[i] = pair;
     }     
   
     Arrays.sort(pairs);
      
     int []lis = new int[N];
     lis[0] = 1;

     for(int i = 1; i < N; i++)
     {
        lis[i] = 1;
        for(int j = 0; j < i; j++)
        {
           if(pairs[i].left > pairs[j].right)
           {
             lis[i] = Math.max(lis[i], lis[j] + 1);
           }
        }
     } 
     
     int ans = 0;
   
     for(int i= 0; i < N; i++)
     {
       ans = Math.max(ans, lis[i]);
     }
     return ans;
   }

  public static void main(String[] args)
  {
     MaximumLengthOfPairChain  pc = new MaximumLengthOfPairChain();
     int[][] A = {{1, 2}, {2, 3}, {3, 4}};
     int actual = pc.solve(A);
     int expected = 2;
     System.out.println(actual == expected);
  }
}
