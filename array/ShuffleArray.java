public class ShuffleArray
{
  public int[] shuffleArray(int[]A, int N)
  {
    int k = 0;
    int ans[] = new int[2 * N];
 
    for(int i = 0, j = N; i < N; i++, j++)
    {
      ans[k++] = A[i];
      ans[k++] = A[j];
    }
   
    return ans;
  }
}
