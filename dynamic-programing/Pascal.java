import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Pascal
{
  public List<List<Integer>> pascalTriangle(int row) {

     List<List<Integer>> ans = new ArrayList<>();   
     ans.add(Arrays.asList(1));
     for(int idx = 1; idx < row; idx++){
        List<Integer> list = new ArrayList<>();
        int prev = 0;
        for(int val : ans.get(idx)){
            list.add(prev + val);
            prev = val;
        }
        list.add(1);
        ans.add(list);
     }

     return ans;
    
  }
}
