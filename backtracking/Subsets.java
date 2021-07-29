import java.util.List;
import java.util.ArrayList;

public class Subsets {
  public List<List<Integer>> subsets(int []A) {
    List<List<Integer>> ans = new ArrayList<>();
    backtrack(A, ans, new ArrayList<>(), 0);
    return ans;
  }

  private void backtrack(int []A, List<List<Integer>> ans, List<Integer> path, int start) {
     ans.add(new ArrayList<>(path));
    
     for(int idx = start; idx < A.length; idx++) {
       path.add(A[idx]);
       backtrack(A, ans, path, idx + 1);
       path.remove(path.size() - 1);
     }
  }
}
