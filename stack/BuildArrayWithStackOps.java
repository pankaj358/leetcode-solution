import java.util.List;
import java.util.ArrayList;

public class BuildArrayWithStackOps
{
  public List<String> build(int[] target, int N)
  {
    List<String> list = new ArrayList<>();
    int i = 0;
    int p = 0;

    for(i = 1; i <= target[target.length - 1]; i++)
    {
      if(i == target[p])
      {
        list.add("Push");
      }
      else
      {
        list.add("Push");
        list.add("Pop");
      }
    }
    return list;
  }
}
