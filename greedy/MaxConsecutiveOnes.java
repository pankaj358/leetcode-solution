public class MaxConsecutiveOnes
{
  public int solve(int []A)
  {
    int ans = 0;
    int count = 0;

    for(int i = 0; i < A.length; i++)
    {
       if(A[i] == 1)
       {
         count++;
       }
       else
       {
          ans = Math.max(ans, count);
          count = 0;
       }
    }

    return Math.max(count, ans);
  }

   public static void main(String[] args)
   {
      MaxConsecutiveOnes maxLen = new MaxConsecutiveOnes();

      int[] A = {1, 1, 0, 1, 1, 1};

      int actual = maxLen.solve(A);
      int expected = 3;
     
      System.out.println(actual == expected);
     
   }
}
