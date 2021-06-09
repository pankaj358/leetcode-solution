public class StarGraph
{
   public int findCenter(int [][] edges){
      int N = edges.length + 1;
      int count[] = new int[N  + 1];

      for(int []edge : edges)
      {
        count[edge[0]]++;
        count[edge[1]]++;
      }

      for(int idx = 1; idx <= N; idx++)
      {
        if(count[idx] == N - 1) return idx;
      }

      return -1;
   }
}
