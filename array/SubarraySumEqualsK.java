import java.util.Map;
import java.util.HashMap;

public class SubarraySumEqualsK
{
  public int subarraySumEqualsK(int []A, int k)
  {
     Map<Integer, Integer> map = new HashMap<>();
     map.put(0, 1);   

     int sum = 0;
     int count = 0;
 
     for(int idx = 0; idx < A.length; idx++)
     {
        sum += A[idx];

        if(map.containsKey(sum - k))
          count += map.get(sum - k);

        map.put(sum, map.getOrDefault(sum,0) + 1);
     }

     return count;
  }
}
