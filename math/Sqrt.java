public class Sqrt
{

  public static int sqrt(int x)
  {
    long r = x;

    while( r * r > x)
    {
       r = (r + x / r) / 2; 
    }

   return (int) r;

  }

  public static void main(String[] args)
  {
     System.out.println(2 == sqrt(8));
  }

}
