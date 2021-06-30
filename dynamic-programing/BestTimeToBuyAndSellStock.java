public class BestTimeToBuyAndSellStock{
    
    public int maxProfit(int []prices) {
        int min = prices[0];
        int max = 0;

       for(int idx = 1; idx < prices.length; idx++){
           min = Math.min(min, prices[idx]);
           max = Math.max(max, prices[idx] - min);
       }
      
       return max;
    }
}
