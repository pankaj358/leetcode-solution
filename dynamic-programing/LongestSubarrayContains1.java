public class LongestSubarrayContains1
{
  public int longestSubarrayContains1(int []A)
  {
     int max = 0;
     int cnt = 0;
     int prev = -1;

     for(int i = 0; i < A.length; i++)
     {
        if(A[i] == 1) cnt++;
        else
        {
          max = Math.max(max, cnt);
          cnt = Math.max(0, i - (prev + 1));
          prev = i;
        }
     }
   
     if(prev == -1) return cnt-1;

     return Math.max(cnt, max);
  }
}
