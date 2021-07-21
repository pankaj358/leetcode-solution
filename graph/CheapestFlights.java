import java.util.Arrays;

public class CheapestFlights
{
   public int chepestFlights(int N, int [][]flights, int src, int dst, int k)
   {
      int []cost = new int[N];
      Arrays.fill(cost, Integer.MAX_VALUE);
 
      cost[src] = 0;

     for(int i=0;i<=k;i++)
      {
        int[] temp= Arrays.copyOf(cost, N);
        for(int[] f: flights)
        {
           int curr=f[0],next=f[1],price=f[2];
           if(cost[curr]==Integer.MAX_VALUE)
               continue;
           temp[next]=Math.min(temp[next],cost[curr]+price);
        }
         cost=temp;
      }
       return cost[dst]==Integer.MAX_VALUE?-1:cost[dst];
   }
}
