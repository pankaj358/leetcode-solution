
import java.util.Map;
import java.util.HashMap;

public class PartitionEqualSubsetSum
{
   public boolean solve(int []A)
   {
      int sum = 0;
      
      for(int i : A) sum+=i;

      if((sum & 1) == 1) return false;
      
       return solve(0, sum / 2, A, new HashMap<String, Boolean>());      
   }


   public boolean solve(int idx, int sum, int[]A, Map<String, Boolean> state)
   {
      String currState = idx + "" + sum;
      if(state.containsKey(currState))
         return state.get(currState);

      if(sum == 0) return true;

      if(sum < 0 || idx > A.length - 1) return false;
  
      boolean found = solve(idx + 1, sum - A[idx], A, state) || solve(idx + 1, sum, A, state);
      state.put(currState, found);
      return found;
   }

   public static void main(String[] args)
   {
      PartitionEqualSubsetSum obj = new PartitionEqualSubsetSum();
      int []A = {1, 5, 5, 11};
      boolean actual = obj.solve(A);
      boolean expected = true;
      System.out.println(actual == expected);
   }
}
