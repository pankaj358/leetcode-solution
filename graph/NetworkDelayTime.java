import java.util.Arrays;

public class NetworkDelayTime
{
  public int networkDelayTime(int [][]times, int N, int K)
  {
    int cost[] = new int[N];
    Arrays.fill(cost, Integer.MAX_VALUE);

    cost[K-1] = 0;   

    for(int idx = 0; idx < N; idx++)
    {
      for(int [] time: times)
      {
         if(time[1] == K || cost[time[0]-1] == Integer.MAX_VALUE) continue;

         cost[time[1]-1] = Math.min(cost[time[1]-1], time[2] + cost[time[0]-1]);
      }
    }

    int max = 0;

    for(int idx = 0; idx < N; idx++)
    {
       if(cost[idx] == Integer.MAX_VALUE) return -1;

       max = Math.max(max, cost[idx]);
    }

    return max;
    
  }
}
