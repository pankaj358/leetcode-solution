import java.util.Set;
import java.util.HashSet;


public class MinimumCostTickets {
  

   private Integer memo[] = new Integer[366];
   private Set<Integer> dayset = new HashSet<>();   
   private int[]costs;

   public int minimumcostTickets(int []days, int []costs) {
      this.costs = costs;
      for(int day : days) dayset.add(day);
      
      return dp(1);
   }

   private int dp(int day) {
      if(day >= 366) return 0;

      if(memo[day] != null) return memo[day];
  
      int ans = 0;

      if(dayset.contains(day)) {
       ans = Math.min(dp(day + 1) + costs[0], dp(day + 7) + costs[1]);
       ans = Math.min(dp(day + 30) + costs[2], ans);
       memo[day] = ans;
       return memo[day];
      } else {
        return dp(day + 1);
     }
   }
}
