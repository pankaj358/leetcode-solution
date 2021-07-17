import java.util.Map;
import java.util.HashMap;

public class SuperEggDrop
{
   public int superEggDrop(int K, int N)
   {
      return dp(K, N);
   }
 
   Map<Integer, Integer> map = new HashMap<Integer, Integer>();

   private int dp(int K, int N)
   {
      if(map.containsKey(N * 100 + K) == false)
      {
         int ans = 0;
         if( N == 0) ans = 0;
         else if( K == 1) ans = N;
         else 
         {
            int low = 1;
            int high = N;
            while(low + 1 < high)
            {
              int mid = low + (high - low) / 2;
              int t1 = dp(K -1, mid - 1);
              int t2 = dp(K, N - mid);
    
              if(t1 < t2) low = mid;
              else if(t1 > t2) high = mid;
              else low = high = mid;
            }
           
          ans = 1 + Math.min(Math.max(dp(K-1, low -1), dp(K, N - low)), Math.max(dp(K-1, high-1), dp(K, N-high))); 
         }
         
         map.put(N * 100 + K, ans);     
      }
      return map.get(N * 100 + K);
   }
}
