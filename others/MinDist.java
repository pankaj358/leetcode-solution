public class MinDist
{
   public int minDist(int[][] cost)
   {
      int N = cost.length;
      int minCost[] = new int[N];     
      minCost[0] = 0;
      minCost[1] = cost[0][1];
     
     for(int i = 2; i < N; i++)
     {
       minCost[i] = cost[0][i];

       for(int j = 1; j < i; j++)
       {
         if(minCost[i] > (minCost[j] + cost[j][i]))
         {
           minCost[i] = minCost[j] + cost[j][i];
         }
       }
     }

     return minCost[N-1];
   }
}
