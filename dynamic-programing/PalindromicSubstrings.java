public class PalindromicSubstrings
{

  public int countPalindromicSubtrings(String str)
  {
     int count = 0;
     int N = str.length();

     for(int i = 0; i < N; i++)
     {
       for(int j = i; j < N; j++)
       {
          if(isPalindrome(str, i, j)) count++;
       }
     }

     return count;
  }

  private boolean isPalindrome(String str, int l, int r)
  {
     while(l < r && str.charAt(l) == str.charAt(r))
     {
       l++;
       r--;
     }

     return l >= r;
  }

}
