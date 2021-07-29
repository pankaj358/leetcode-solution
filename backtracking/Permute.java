import java.util.List;
import java.util.ArrayList;

public class Permute
{
  public List<List<Integer>> permute(int []A) {
    List<List<Integer>> ans = new ArrayList<>();
    backtrack(A,ans, new ArrayList<Integer>());
    return ans;
  }

  private void backtrack(int []A, List<List<Integer>> ans, List<Integer> path){
     if(A.length == path.size()) {
        ans.add(new ArrayList<>(path)); 
        return;
     }

     for(int idx = 0; idx < A.length; idx++) {
        if(path.contains(A[idx])) continue;
        path.add(A[idx]);
        backtrack(A, ans, path);
        path.remove(path.size() - 1);
     }
  }
}
