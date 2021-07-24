public class DisjoinSetUnion
{
  private int[] parent;
  private int[] rank;

  public DisjoinSetUnion(int size)
  {
    this.rank = new int[size];
    this.parent = new int[size];
   
    for(int idx = 0; idx < size; idx++)
     parent[idx] = idx;
  }

  public int find(int x)
  {
    if(parent[x] != x) find(parent[x]); 
    return parent[x];
  }


  public boolean union(int x, int y)
  {
    int xr = find(x);
    int yr = find(y);
 
    if(xr == yr) return false;

    if(rank[xr] < rank[yr])
    {
      parent[xr] = yr;
    } 
    else if(rank[xr] > rank[yr])
    {
      parent[yr] = xr;
    }
    else 
    {
      parent[xr] = yr;
      rank[xr]++; 
    }
     
    return true;
    
  }
  

}
