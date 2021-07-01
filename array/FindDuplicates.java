
import java.util.List;
import java.util.ArrayList;


public class FindDuplicates
{
   public List<Integer> findDuplicates(int[] A)
   {
     int data[] = new int[A.length + 1];
    
     for(int idx = 0; idx < A.length; idx++)
       data[A[idx]]++;

     List<Integer> list = new ArrayList<>();    

     for(int idx = 1; idx < data.length; idx++)
     {
       if(data[idx] == 2)
        list.add(idx);
     }

     return list;
   }
}
