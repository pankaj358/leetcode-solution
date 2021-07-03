import java.util.TreeSet;

public class ContainsDuplicateIII
{
   public boolean containsNearbyAlmostDuplicate(int []A ,int k, int t)
   {
     TreeSet<Long> set = new TreeSet<>();

     for(int i = 0; i < A.length; i++)
     {
        long a = A[i];
        long b1 = a - t;
        long b2 = a + t;

        Long v1 = set.ceiling(b1);
        Long v2 = set.floor(b2);

        if((v1 != null && v1 <= a) || (v2 != null &&  v2 >= a))
          return true;

        set.add(a);
        
        if(i >= k) set.remove((long)A[i-k]);
     }
  
     return false;
   } 
}
