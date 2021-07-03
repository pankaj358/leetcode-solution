public class FlipArray
{
  public int[][] flip(int [][]flip)
  {
     for(int row = 0; row < flip.length; row++)
     {
        flip(flip[row]);
        for(int col = 0; col < flip[row].length; col++)
         flip[row][col] = flip[row][col] == 1 ? 0 : 1;
     }

     return flip;
  }

  private void flip(int []A)
  {
    int left = 0;
    int right = A.length - 1;

    while(left < right)
    {
      int t = A[left];
      A[left] = A[right];
      A[right] = t;
    }
  }
}
