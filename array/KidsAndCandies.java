import java.util.List;
import java.util.ArrayList;

public class KidsAndCandies
{
  public List<Boolean> kidsAndCandies(int[] candies, int extraCandies)
  {
     int max = 0;
     for(int idx = 0; idx < candies.length; idx++)
     {
        max = Math.max(candies[idx], max);
     }

     List<Boolean> ans = new ArrayList<>();
  
     for(int idx = 0; idx < candies.length; idx++)
     {
        ans.add(candies[idx] + extraCandies >= max);
     }

     return ans;
  }
}
