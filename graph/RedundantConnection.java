public class RedundantConnection
{
 
  int MAX_EDGE = 1000;

  public int[] findRedundantConnection(int[][] edges)
  {
     DSU dsu = new DSU(MAX_EDGE);
    
     for(int []edge : edges)
     {
       if(!dsu.union(edge[0], edge[1])) return edge;
     }

     return new int[2];
  } 

  class DSU
  {
    private int[] rank;
    private int[] parent;

    public DSU(int size)
    {
      parent = new int[size];
      for(int idx = 0; idx < size; idx++) 
       parent[idx] = idx;

      rank = new int[size];
    }

    public int find(int x)
    {
      if(parent[x] != x) return find(parent[x]);
      return parent[x];
    }
    
    public boolean union(int x, int y)
    {
      int xr = find(x);
      int yr = find(y);
      
      if(xr == yr) return false;
      else if(rank[xr] < rank[yr]) parent[xr] = yr;
      else if(rank[xr] > rank[yr]) parent[yr] = xr;
      else {
          parent[yr] = xr;
          rank[xr]++;
      }
      return true;
     
    }
  }
}
