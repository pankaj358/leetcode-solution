
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class LongestStringChain{

  public int solve(String[] words)
  {
     Map<String, Integer> dp = new HashMap<>();
     Arrays.sort(words, (a, b)-> a.length() - b.length());
     
     int longestWordSequenceLength = 1;

     for(String word : words)
     {
       int presentLength = 1;
       for(int i = 0; i < word.length(); i++)
       {
         StringBuilder tmp = new StringBuilder(word);
         tmp.deleteCharAt(i);
         String predecessor = tmp.toString();
         int previousLength = dp.getOrDefault(predecessor, 0);
         presentLength = Math.max(presentLength, previousLength + 1);
       }
       dp.put(word, presentLength);
       longestWordSequenceLength = Math.max(longestWordSequenceLength, presentLength);
     }

     return longestWordSequenceLength;    
 
  }
   
  public static void main(String[] args)
  {
     LongestStringChain lsc = new LongestStringChain();
     String[] words = {"a", "b", "ba", "bca", "bda", "bdca"};
     int actual = lsc.solve(words);
     int expected = 4;

     System.out.println(actual == expected);
  }
   
}
