public class PerfectSquare
{
  int ans = Integer.MAX_VALUE;
 
  public int perfectSquare(int N)
  {
    if(N <= 0) return 0;

    if(N == 1) return 1;

    for(int i = 1; i * i <= N; i++)
     ans = Math.min(ans, 1 + perfectSquare(N - i * i));

    return ans;
  }
}
