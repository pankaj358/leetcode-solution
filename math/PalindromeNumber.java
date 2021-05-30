public class PalindromeNumber
{

  public boolean palindromeNumber(int A)
  {
    int  x = A;
    int y = 0;
    
     while(x != 0)
     {
       int z = x % 10;
        y = y * 10 + z;
       x /=10;
     }

     return y == A;
  }

}
