import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

   public int[][] mergeIntervals(int [][]A) {
     Arrays.sort(A, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));

     int i = 0;
     List<int[]> list = new ArrayList<>();

      while(i < A.length) {
        int []tmp = {A[i][0], A[i][1]};
        int j = i + 1;
 
        while(j < A.length && A[j][0] <= tmp[1]) {
          tmp[1] = Math.max(tmp[1], A[j][1]);
          j++; 
        }

        i = j;
        list.add(tmp);
      }

      int [][]ans = new int[list.size()][2];
      int idx = 0;
      for(int []tmp : list ) ans[idx++] = tmp;

      return ans; 
   }
}
