import java.util.List;
import java.util.ArrayList;

public class DecompressRLElist
{
  public int[] decompressRLElist(int []A)
  {
    List<Integer> list = new ArrayList<>();
    for(int idx = 0; idx < A.length; idx +=2)
    {
      int freq = A[idx];
      while(freq > 0)
      {
        list.add(A[idx + 1]);
      }
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}
