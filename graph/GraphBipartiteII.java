import java.util.Queue;
import java.util.LinkedList;

public class GraphBipartiteII
{
   public boolean isGraphBipartite(int[][] graph)
   {
      int N = graph.length;
      int []colors = new int[N];

      for(int idx = 0; idx < N; idx++)
      {
        if(colors[idx] != 0) continue;
      
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(idx);       
        colors[idx] = 1;

        while(!queue.isEmpty())
        {
          int curr = queue.poll();
          for(int next : graph[curr])
          {
            if(colors[next] == 0)
            {
              colors[next] = -colors[curr];
              queue.offer(next);
            }
            else if(colors[next] != -colors[curr]) return false;
          }
        }
      }

      return true;
   }

}
