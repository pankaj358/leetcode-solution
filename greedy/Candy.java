
import java.util.Arrays;

public class Candy
{
  public int solve(int[] A)
  {
    int N = A.length;
    int candies[] = new int[N];
    int ans = 0;
    Arrays.fill(candies, 1);

    for(int i = 1; i < N; i++)
    {
      if(A[i] > A[i - 1])
      {
        candies[i] = candies[i - 1] + 1;
      }
    }

    for(int i = N - 2; i >= 0; i--)
    {
       if(A[i] > A[i + 1])
       {
         candies[i] = Math.max(candies[i], candies[i + 1] + 1);
       }
       ans+=candies[i];
    }   
    
    return ans + candies[N - 1];
    
  } 

  public static void main(String[] args)
  {
    Candy candy = new Candy();
    int [] A = {1, 0, 2};
    int actual = candy.solve(A);
    
    int expected = 5;   
 
    System.out.println(actual == expected);    

  }
  
 
}
