import java.util.List;
import java.util.ArrayList;


public class MinNumberOfVerticesToReachAllNodes
{
  List<Integer> minimumNumberOfVerticesToReachAllNodes(int N, List<List<Integer>> edges){
      List<Integer> ans = new ArrayList<>();
      boolean []visited = new boolean[N];
      for(List<Integer> edge : edges){
         visited[edge.get(1)] = true;
      }
      for(int idx = 0; idx < N; idx++){
         if(visited[idx] == false){
            ans.add(idx);
         }
      }

     return ans;
  }
}
