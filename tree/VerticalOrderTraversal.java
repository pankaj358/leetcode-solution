import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.Map;
import java.util.Collections;

public class VerticalOrderTraversal {

 
  class TreeNode {
     TreeNode left;
     TreeNode right;
     int val;
  } 

  public List<List<Integer>> verticalOrderTraversal(TreeNode root) {

     NavigableMap<Integer, NavigableMap<Integer, List<Integer>>> navigableMap = new TreeMap<>();
    
     verticalOrder(root, navigableMap, 0, 0);     
     
     List<List<Integer>> ans = new ArrayList<>();

     for(Map.Entry<Integer, NavigableMap<Integer, List<Integer>>> colEntry : navigableMap.entrySet()) {
        List<Integer> tmp = new ArrayList<>();

        for(Map.Entry<Integer, List<Integer>> rowEntry : colEntry.getValue().entrySet()) {
             List<Integer> list = rowEntry.getValue();
             Collections.sort(list);
             tmp.addAll(list);
         }

         ans.add(tmp);
      }

     return ans;
  }

  private void verticalOrder(TreeNode root, NavigableMap<Integer, NavigableMap<Integer, List<Integer>>> colMap, int row, int col) {
     if(root == null) return;

     NavigableMap<Integer, List<Integer>> rowMap = colMap.getOrDefault(col, new TreeMap<Integer, List<Integer>>());
     List<Integer> rowList = rowMap.getOrDefault(row, new ArrayList<Integer>());
     rowList.add(root.val);
     rowMap.put(row, rowList);
     colMap.put(col, rowMap);

     verticalOrder(root.left, colMap, row + 1, col - 1);
     verticalOrder(root.right, colMap, row + 1, col + 1);
  }

}
