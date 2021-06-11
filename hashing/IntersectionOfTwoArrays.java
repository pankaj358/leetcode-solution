import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class IntersectionOfTwoArrays
{
  public int[] intersectionOfTwoArrays(int[] A, int []B){
     Set<Integer> set = new HashSet<>();

     for(int val : A)
       set.add(val);

     List<Integer> result = new ArrayList<>();     

     for(int val : B)
       if(set.contains(val)){
         result.add(val);
         set.remove(val);
      }

     return result.stream().mapToInt(Integer::intValue).toArray();

  }
}
