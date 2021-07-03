import java.util.List;
import java.util.ArrayList;

public class CreateTargetArray
{
  public int[] createTargetArray(int []A, int []index)
  {
    List<Integer> list = new ArrayList<>();

    for(int idx = 0; idx < index.length; idx++)
    {
      list.add(index[idx], A[idx]);
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}
