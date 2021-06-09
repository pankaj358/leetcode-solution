
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class FindTheTownJudge
{
   public int findJudge(int N, int [][]trust){
      Map<Integer, Set<Integer>> map = new HashMap<>();
      
      for(int idx = 0; idx < trust.length; idx++)
      {
         Set<Integer> set = map.getOrDefault(trust[idx][0], new HashSet<Integer>());
         set.add(trust[idx][1]);
         map.put(trust[idx][0], set);
      }

      int cand = -1;

      for(int idx = 1; idx <= N; idx++)
      {
        if(map.containsKey(idx))
        {
           cand = idx;
           break;
        }
      }

     for(int idx = 1; idx <= N; idx++)
     {
        if(idx != cand && (map.containsKey(idx) == false || map.get(idx).contains(cand) == false)) 
          return -1;
     }

     return cand; 
       
   }
}
