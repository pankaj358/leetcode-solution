import java.util.Map;
import java.util.HashMap;


public class IsScramble{

  public boolean isScramble(String s1, String s2){
     return isScramble(s1, s2, new HashMap<>());
  }

  public boolean isScramble(String s1, String s2, Map<String, Boolean> map){
     if(s1.equals(s2)) return true;
     
     String key = s1 + "," + s2;
    
     if(map.containsKey(key)) return map.get(key);
    
     int N = s1.length();

     for(int idx = 1; idx < N; idx++) {
       boolean original = isScramble(s1.substring(0, idx), s2.substring(0, idx), map) && isScramble(s1.substring(idx), s2.substring(idx), map);
       boolean flipCase = isScramble(s1.substring(0, idx), s2.substring(0, N - idx), map ) && isScramble(s1.substring(idx), s2.substring(0, N - idx), map);
       if(original || flipCase) {
         map.put(key, true);
         return true;
       }
     } 

     map.put(key, false);
     return false;
     
  }

}
