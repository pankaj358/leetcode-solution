public class GasStation
{

  public int solve(int gas[], int []cost)
  {
    int sum1 = 0;
    int sum2 = 0;
    int index = 0;
  
    int N = gas.length;  
  
    for(int i = 0; i < N; i++)
    {
      int balance = gas[i] - cost[i];
      sum1 += balance;
      sum2 += balance;
  
      if(sum2 < 0)
      {
        sum2 = 0;
        index = i + 1;
      }
    }

    return sum1 < 0 ? -1 : index;
  }

  public static void main(String[] args)
  {
     GasStation gs = new GasStation();
     int gas[] = {1, 2, 3, 4, 5};
     int cost[] = {3, 4, 5, 1, 2};
     int actual = gs.solve(gas, cost);
     int expected = 3;

     System.out.println(expected == actual);
  }

}
