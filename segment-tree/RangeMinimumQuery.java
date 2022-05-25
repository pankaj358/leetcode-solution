
import java.util.List;
import java.util.ArrayList;


public class RangeMinimumQuery
{

 private int []A;
 private int []tree;  


 public int[] solve(int []A, int [][]B)
 {
    this.A = A;
    this.tree = new int[4 * A.length];
    build(0, 0, A.length - 1);
   
    List<Integer> ans = new ArrayList<>();
    
    for(int idx = 0; idx < B.length; idx++)
    {
      int x = B[idx][0];
      int y = B[idx][1];
      int z = B[idx][2];
 
      if(x == 0)
      {
        update(0, 0, A.length - 1, y - 1, z);
      }
      else if (x == 1)
      {
        int res = query(0, 0, A.length - 1, y - 1, z - 1);
        ans.add(res);  
      }
    }

    return ans.stream().mapToInt(Integer::intValue).toArray();  
 } 



 private void update(int idx, int start, int end, int pos, int val)
 {
    if(pos > end || pos < start) return;
   
    if(start == end) 
    {
      tree[idx] = val;
      return;
    }

    int mid = start + (end - start) / 2;

    update(2 * idx + 1, start, mid, pos, val);
    update(2 * idx + 2, mid + 1, end, pos, val);
    
    tree[idx] = Math.min(tree[2 * idx + 1], tree[2 * idx + 2]);  
 } 


 private int query(int idx, int start, int end, int rStart, int rEnd) 
 {
   if(rStart <= start && rEnd >= end) return tree[idx];

   if(rStart > end || rEnd < start)  return Integer.MAX_VALUE;

   int mid = start + (end - start) / 2;
 
   return Math.min(query(2 * idx + 1, start, mid, rStart, rEnd), query(2 * idx + 2, mid + 1, end, rStart, rEnd));
 }


 private void build(int idx, int start, int end)
 {
    if(start == end)
    {
      tree[idx] = A[start];
      return;
    } 

    int mid = start + (end - start) / 2;

    build(2 * idx + 1, start, mid);
    build(2 * idx + 2, mid + 1, end);

    tree[idx] = Math.min(tree[idx * 2 + 1], tree[idx * 2 + 2]);
 }
 
}
