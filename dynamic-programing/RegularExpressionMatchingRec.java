public class RegularExpressionMatchingRec
{
   public boolean isMatch(String text, String pattern)
   {
      if(pattern.isEmpty()) return text.isEmpty();
      
      boolean firstMatch = (!text.isEmpty()) && (pattern.charAt(0) == text.charAt(0)) || pattern.charAt(0) == '.';
     
      if(pattern.length() >= 2 && pattern.charAt(1) == '*')
      {
                // 1st call for ZERO character matching
                // 2nd call for ONE or MORE character matching
         return isMatch(text, pattern.substring(2))
                || (firstMatch && isMatch(text.substring(1), pattern));
      } 
      else
      {
         return firstMatch && isMatch(text.substring(1), pattern.substring(1));
      }
 
   }

   public static void main(String args[])
   {
      RegularExpressionMatchingRec match = new RegularExpressionMatchingRec();

      System.out.println(match.isMatch("aaaaaaaaaaaaaa", "a*"));
   }
}
