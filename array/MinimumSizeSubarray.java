public class MinimumSizeSubarray
{

  public int minimumSizeSubarray(int target, int []A)
  {
     int N = A.length;
     int left = 0;
     int sum = 0;
     int ans = Integer.MAX_VALUE;

     for(int idx = 0; idx < N; idx++)
     {
        sum +=A[idx];
        while(sum >= target)
        {
          ans = Math.min(ans, idx + 1 - left);
          sum -= A[left++];
        }
     }

     return ans == Integer.MAX_VALUE ? 0 : ans;
  }

}
