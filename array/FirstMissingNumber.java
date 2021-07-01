import java.util.Set;
import java.util.HashSet;

public class FirstMissingNumber
{
   public int firstMissingNumber(int[] A)
   {
     Set<Integer> data = new HashSet<>();
     for(int idx = 0; idx < A.length; idx++)
     {
       if(A[idx] > 0)
        data.add(A[idx]);
     }

     int idx = 0;
     for(idx = 1; idx <= A.length; idx++)
     {
        if(data.contains(idx) == false)
         break;
     }

     return idx;
   }
}
