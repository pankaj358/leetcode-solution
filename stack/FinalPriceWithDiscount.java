public class FinalPriceWithDiscount
{
  public int[] finalPriceWithDiscount(int[] prices)
  {
     int N = prices.length;
     int []ans = new int[N];
     for(int idx = 0; idx < N; idx++ )
     {
       ans[idx] = -1;
       for(int idx1 = idx + 1; idx1 < N; idx1++)
       {
          if(prices[idx] > prices[idx1])
          {
            ans[idx] = prices[idx] - prices[idx1];
            break;
          }
       }

       if(ans[idx] == -1 )
         ans[idx] = prices[idx];
     }

    return ans;
  }
}
