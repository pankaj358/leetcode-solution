import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class IntersectionOfTwoArraysII
{
  public int[] intersectionOfTwoArraysII(int []A, int []B){
      Map<Integer, Integer> map = new HashMap<>();

      for(int val : A)
      {
         int cnt = map.getOrDefault(val, 0);
         map.put(val, cnt + 1);
      }

      List<Integer> result = new ArrayList<>();

      for(int val : B){
        if(map.containsKey(val)){
           result.add(val);
           int cnt = map.get(val);
           if(cnt == 1) map.remove(val);
           else map.put(val, cnt - 1);
        }
      }

     return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
