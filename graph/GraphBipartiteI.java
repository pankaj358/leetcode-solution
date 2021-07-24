public class GraphBipartiteI
{
   public boolean isGraphBipartite(int[][] graph)
   {
     int N = graph.length;
     int[] colors = new int[N];

     for(int idx = 0; idx < N; idx++)
     {
        if(colors[idx] == 0 && !isValidColor(graph, idx, 1, colors)) return false;
     }

     return true;
   }

   private boolean isValidColor(int [][]graph, int idx, int color, int []colors)
   {
     if(colors[idx] != 0)  return colors[idx] == color;

     colors[idx] = color;

     for(int node : graph[idx])
     {
       if(!isValidColor(graph, node, -color, colors)) return false;
     }
     return true;
   }
}
