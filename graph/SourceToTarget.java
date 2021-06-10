import java.util.List;
import java.util.ArrayList;

public class SourceToTarget
{
   public List<List<Integer>> sourceToTarget(int[][] graph){
     List<List<Integer>> res = new ArrayList<>();
     List<Integer> path = new ArrayList<>();
     
     dfs(res, 0, path, graph);     
 
     return res;
  }

  public void dfs(List<List<Integer>> res, int node, List<Integer> path, int[][] graph){
      
     if(node == graph.length - 1)
     {
       res.add(new ArrayList<>(path));
       return;
     }

     for(int nextNode : graph[node]){
        path.add(nextNode);
        dfs(res, nextNode, path, graph);
        path.remove(path.size() - 1);
     }
  }
}
