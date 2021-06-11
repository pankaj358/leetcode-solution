import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream; 

public class FindCommonCharacters
{
   public List<String> commonCharacters(String[] A) {
       int count[] = new int[26];
       Arrays.fill(count, Integer.MAX_VALUE);
     
       for(String str : A)
       {
         int cnt[] = new int[26];
         str.chars().forEach(c -> ++cnt[c - 'a']);
         IntStream.range(0, 26).forEach( i -> count[i] = Math.min(cnt[i], count[i]));
       }

       List<String> ans = new ArrayList<>();
       IntStream.range('a', 'z' + 1).forEach(ch -> ans.addAll(Collections.nCopies(count[ch - 'a'], "" + (char)ch)));
       return ans;
   }
}
