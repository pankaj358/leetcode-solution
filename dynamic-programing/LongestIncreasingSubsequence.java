public class LongestIncreasingSubsequence
{

  public int solve(int []A)
  {
    int []lis = new int[A.length];

    lis[0] = 1;    

    for(int i = 1; i < A.length; i++)
    {
      lis[i] = 1;
      for(int j = 0; j < i; j++)
       {
          if(A[j] < A[i])
          {
            lis[i] = Math.max(lis[i], lis[j] + 1);
          }
       }
    }  

    int ans = 0;

    for(int i = 0; i < lis.length; i++)
     ans =  Math.max(ans, lis[i]);
     
    return ans;
  }

  public static void main(String [] args) 
  {
    LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
    int []A = {10, 9, 2, 5, 3, 7, 101, 18};
    int actual = lis.solve(A);
    int expected = 4;
    System.out.println(actual == expected);
  }

}
