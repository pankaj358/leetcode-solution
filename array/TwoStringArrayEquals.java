public class TwoStringArrayEquals
{
 public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       
        String s1 = "";
        
        for(int idx = 0; idx < word1.length; idx++)
            s1 += word1[idx];
        
        String s2 = "";
        
        for(int idx = 0; idx < word2.length; idx++)
           s2 += word2[idx];
        
        return s1.equals(s2);
    } 
}
