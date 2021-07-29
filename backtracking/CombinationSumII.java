import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumII {
     
   public List<List<Integer>> combinationSum(int []A, int target) {
     Arrays.sort(A);
     List<List<Integer>> ans = new ArrayList<>();
     boolean []visited = new boolean[A.length];
     backtrack(A, ans, new ArrayList<>(), target, 0, visited, 0 );
     return ans;
   }

   private void backtrack(int []A, List<List<Integer>> ans, List<Integer> path, int target, int currSum, boolean[] visited, int start) {
      if(target == currSum) {
         ans.add(new ArrayList<>(path));
         return;
      }

      for(int idx = start; idx < A.length; idx++) {
          
         if(currSum + A[idx] <= target) {
            if(visited[idx] || (start < idx && A[idx] == A[idx-1] && !visited[idx])) continue;
            visited[idx] = true;
            currSum += A[idx];
            path.add(A[idx]);
            backtrack(A, ans, path, target, currSum, visited, idx + 1);
            visited[idx] = false;
            currSum -= A[idx];
            path.remove(path.size() - 1);  
         }
      }
   }
}
