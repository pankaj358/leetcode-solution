public class BestTimeToBuyAndSellStockII
{

  public int solve(int[] A)
  {
    int sum = 0;

    for(int i = 1; i < A.length; i++)
    {
       if(A[i] - A[i - 1] > 0)
       {
          sum+= A[i] - A[i - 1];
       }
    }   
    return sum; 
  }

  public static void main(String[] args) 
  {
     BestTimeToBuyAndSellStockII sb = new BestTimeToBuyAndSellStockII();
     int[]A = {7, 1, 5, 3, 6, 4};
     int actual = sb.solve(A);
     int expected = 7;

     System.out.println(expected == actual);
 
  }

}
