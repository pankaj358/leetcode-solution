public class XorOperationInArray
{
  public int xorOperationInArray(int N, int start){
     int ans = 0;

      for(int idx = 0; idx < N; idx++)
      {
        ans ^= (start + (idx * 2));
      }

      return ans;
   }
}
