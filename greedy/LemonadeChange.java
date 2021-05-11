public class LemonadeChange
{
   public boolean solve(int []bills)
   {
     int count5 = 0;
     int count10 = 0;

     for(int i = 0; i < bills.length; i++)
     {
        if(count5 == 0 && bills[i] > 5)
        {
          return false;
        }
        else if(bills[i] == 5)
        {
          count5++;
        }
        else if(bills[i] == 10)
        {
          count10++;
          count5--;
        }
        else if(bills[i] == 20)
        {
           if(count10 > 0)
           {
             count10--;
             count5--;
           }
           else if(count5 >= 3)
           {
             count5-=3;
           }
           else
           {
             return false;
           }
        }

     }

     return true;
   }

  public static void main(String[] args)
  {
    LemonadeChange lc = new LemonadeChange();
    int []A = {5,5,5,10, 5, 5, 10, 20, 20, 20};
    boolean actual = lc.solve(A);
    boolean expected = false;
    
    System.out.println(actual == expected); 
  }
}
