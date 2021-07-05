import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagrams
{
  public List<List<String>> groupAnagrams(String[] strs)
  {
     Map<String, List<String>> map = new HashMap<>();

     for(String str: strs)
     {
       char []arr = str.toCharArray();
       Arrays.sort(arr);
       String sorted = new String(arr);
       List<String> list = map.getOrDefault(sorted, new ArrayList<>());
       list.add(str); 
       map.put(sorted, list);
     }
   
    return new ArrayList<>(map.values());
  }
}
