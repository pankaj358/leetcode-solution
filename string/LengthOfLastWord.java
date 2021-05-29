public class LengthOfLastWord
{
  public int solve(String str)
  {
     if(str.trim().length() == 0) return 0;

     String []A = str.split(" ");

     return A[A.length - 1].trim().length();
  }
}

