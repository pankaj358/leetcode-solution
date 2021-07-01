import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class FindAllNumbersDisappeared
{
  public List<Integer> findAllNumbersDisappeared(int []A)
  {
    Set<Integer> set = new HashSet<>();
    for(int idx = 0; idx < A.length; idx++)
    {
      set.add(A[idx]);
    }

    List<Integer> ans = new ArrayList<>();
 
    for(int idx = 1; idx <= A.length; idx++)
    {
       if(set.contains(idx) == false)
        ans.add(idx);
    }

    return ans;
  }
}
