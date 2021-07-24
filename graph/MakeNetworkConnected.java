import java.util.List;
import java.util.ArrayList;

public class MakeNetworkConnected
{
  public int makeNetworkConnected(int N, int[][] connections)
  {
     if(connections.length < N - 1) return -1;

     List<Integer>[] graph = new List[N];

     for(int idx = 0; idx < N; idx++)
       graph[idx] = new ArrayList<>();
  
     for(int []conn : connections)
     {
       graph[conn[0]].add(conn[1]);
       graph[conn[1]].add(conn[0]);
     }
 
     int comp = 0;
    
     boolean []visited = new boolean[N];
     
     for(int idx = 0; idx < N; idx++)
      comp +=dfs(graph, idx, visited);

     return comp - 1;
  }

  private int dfs(List<Integer>[] graph, int idx, boolean []visited)
  {
     if(visited[idx])  return 0;
     visited[idx] = true;
   
     for(int nextIdx : graph[idx])
      dfs(graph, nextIdx, visited);    
 
     return 1;
  }
}
