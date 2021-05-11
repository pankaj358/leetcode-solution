public class BestTimeToBuyAndSellStock
{
   public int solve(int []A)
   {
     int max = 0;
     int min = A[0];

     for(int i = 1; i < A.length; i++)
     {
        min = Math.min(min, A[i]);
        max = Math.max(max, A[i] - min);
     }

     return max;
   }

  public static void main(String[] args) 
  {
     BestTimeToBuyAndSellStock bs = new BestTimeToBuyAndSellStock();     
     int []A = {7, 1, 5, 3, 6, 4};
     
     int actual = bs.solve(A);

     int expected = 5;

     System.out.println(actual == expected);
  }
  
}
