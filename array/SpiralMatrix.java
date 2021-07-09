import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix
{
  public List<Integer> spiral(int[][] A)
  {
    List<Integer> ans = new ArrayList<>();
   
    int r1 = 0;
    int r2 = A.length - 1;
    int c1 = 0;
    int c2 = A[0].length - 1;

    while(r1 <= r2 && c1 <= c2)
    {

      for(int c = c1; c <= c2; c++)  ans.add(A[r1][c]);
      for(int r = r1 + 1; r<= r2; r++) ans.add(A[r][c2]);

      if(r1 < r2 && c1 < c2)
      {
        for(int c = c2 - 1; c > c1; c--) ans.add(A[r2][c]);
        for(int r = r2; r > r1; r--)  ans.add(A[r][c1]);
      } 

      r1++;
      r2--;
      c1++;
      c2--;
    }
    
    return ans; 
  }
}
