import java.util.Map;
import java.util.HashMap;

public class CheckIfDoubleExist
{
  public boolean checkIfExist(int []A)
  {
     Map<Integer, Integer> map = new HashMap<>();
    
     for(int idx = 0; idx < A.length; idx++)
     {
        map.put(A[idx], idx);
     }

     for(int idx = 0; idx < A.length; idx++)
     {
        int value = A[idx] + A[idx];
        if(map.containsKey(value) && idx != map.get(value)) return true;
     }

     return false;
  }
}
