import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PermutationII {
  public List<List<Integer>> permutation(int []A) {
    Arrays.sort(A);
    List<List<Integer>> ans = new ArrayList<>();
    backtrack(A, ans, new ArrayList<>(), new boolean[A.length]);
    return ans;
  }

  private void backtrack(int []A, List<List<Integer>> ans, List<Integer> path, boolean []visited) {
     if(path.size() == A.length) {
        ans.add(new ArrayList<>(path));
        return;
     }

     for(int idx = 0; idx < A.length; idx++) {
         if(visited[idx] || (idx > 0 && A[idx] == A[idx - 1] && !visited[idx - 1])) continue;
         visited[idx] = true;
         path.add(A[idx]);
         backtrack(A, ans, path, visited);
         visited[idx] = false;
         path.remove(path.size() - 1);
      }
  }
}
