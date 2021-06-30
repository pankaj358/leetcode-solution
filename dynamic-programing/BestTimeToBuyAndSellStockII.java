public class BestTimeToBuyAndSellStockII{
    
    public int maxProfit(int []prices) {    

      int ans = 0;

      for(int idx = 0; idx < prices.length; idx++){
           if(prices[idx] - prices[idx - 1] > 0) { 
             ans += prices[idx] - prices[idx - 1];
          }
       }

       return ans;      

    }
}
