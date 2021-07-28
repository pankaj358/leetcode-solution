public class NumberComplement
{
  public int numberComplement(int N)
  {
     int i = 0;
     int j = 0;

     while(i < N)
     {
       i +=(int)Math.pow(2, j);
       j++;
     }

     return i - N;
   }
}
