import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class KeysAndRooms
{
  public boolean keysAndRooms(List<List<Integer>> graph){
      Stack<Integer> dfs = new Stack<>();
      dfs.push(0);
      Set<Integer> set = new HashSet<>();
      set.add(0);

      while(dfs.isEmpty() == false){
          int curr = dfs.pop();
          for(int next : graph.get(curr))
          {
            if(set.contains(next) == false){
                set.add(next);
                dfs.push(next);
            }
          }

         if(set.size() == graph.size()) return true;
      }

      return graph.size() == set.size();
  }
}
