public class IsSubsequence
{
   public boolean isSubsequence(String s, String t)
   {
      for(int i = 0; i < s.length(); i++)
      {
         int idx = t.indexOf(s.charAt(i));
         if(idx == -1) return false;
         t = t.substring(idx + 1);
      }
      return true; 
   }
   
   public static void main(String[] args)
   {
      IsSubsequence sub = new IsSubsequence();
      String s = "abc";
      String t = "ahbgdc";

      boolean actual = sub.isSubsequence(s, t);
      boolean expected = true;

      System.out.println(actual == expected);
     
   }
}
