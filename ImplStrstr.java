
/**
*
*
* problem link : https://leetcode.com/problems/implement-strstr/
*
*
*/

class ImplStrstr
{

  public static int strStr(String haystack, String needle)
  {
     if(haystack.equals(needle) || needle.length() == 0) return 0;

     if(haystack.length() < needle.length()) return -1;


     for(int i = 0; i < haystack.length(); i++)
     {
       int j = 1;
       for(; j < needle.length(); j++)
       {
          if(i + j >= haystack.length()) return -1;
          
          if(haystack.charAt(i + j) != needle.charAt(j)) break;
       }

       if(j == needle.length()) return i;

     }

    return -1;
  }

}
