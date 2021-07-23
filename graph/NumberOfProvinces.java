public class NumberOfProvinces
{
   public int numberOfProvinces(int [][]isConnected)
   {
      int count = 0;
      int []visited = new int[isConnected.length];

      for(int idx = 0; idx < isConnected.length; idx++)
      {
        if(visited[idx] == 0)
        {
          visited[idx] = 1;
          dfs(isConnected, visited, idx);
          count++;
        }
      }

      return count;
   }

   public void dfs(int [][] graph, int[] visited, int idx)
   {
     
     for(int j = 0; j < graph.length; j++)
     {
        if(graph[idx][j] == 1 && visited[j] == 0)
        {
          visited[j] = 1;
          dfs(graph, visited, j);
        }
     }
   }
}
