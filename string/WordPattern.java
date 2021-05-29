
import java.util.Map;
import java.util.HashMap;


public class WordPattern
{
   public boolean wordPattern(String pattern, String S)
   {
     String []A = S.split("\\s+");
     
     if(pattern.length() != A.length ) return false;

     Map<Character, String> map = new HashMap<>();
 
     for(int i = 0; i < A.length; i++)
     {
       char ch = pattern.charAt(i);
       if(map.containsKey(ch))
       {
         if(!map.get(ch).equals(A[i])) return false; 
       }
       else
        {
           if(map.containsValue(A[i])) return false;
            
           map.put(ch, A[i]);
        }
     }
     return true;
   }
}
