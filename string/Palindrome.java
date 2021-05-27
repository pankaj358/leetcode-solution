public class Palindrome
{

  public static boolean isPalindrome(String s)
  {
     String str = s.replaceAll("[^a-zA-Z0-9]", " ").replaceAll("\\s", "").toLowerCase(); 
     int l = 0;
     int r = str.length() - 1;

     while(l < r && str.charAt(l) == str.charAt(r))
     {
       l++;
       r--;
     }

    return l >= r;
  }

  public static void main(String [] args)
  {
      System.out.println(Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
      System.out.println(Palindrome.isPalindrome("0P"));
  }

}
