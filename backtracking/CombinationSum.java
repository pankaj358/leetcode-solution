import java.util.List;
import java.util.ArrayList;

public class CombinationSum {
   public List<List<Integer>> combinationSum(int []A, int target) {
      List<List<Integer>> ans = new ArrayList<>();
      backtrack(A, ans, new ArrayList<>(), target, 0, 0);
      return ans;
   }

   private void backtrack(int []A, List<List<Integer>> ans, List<Integer> path, int target, int currSum, int start) {
       if(currSum == target) {
         ans.add(new ArrayList<>(path));
         return;
      }

      for(int idx = start; idx < A.length; idx++) {
         if(currSum + A[idx] <= target) {
           currSum += A[idx];
           path.add(A[idx]);
           backtrack(A, ans, path, target, currSum, idx);
           currSum -= A[idx];
           path.remove(path.size() - 1);
         }
      }
   }
}
