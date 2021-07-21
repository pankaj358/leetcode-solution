public class MoneyInLeetbank
{
  public int moneyInLeetBank(int N)
  {
    int extra = N % 7; 
    int weeks = N / 7;

    return 28 * weeks + 7 * (weeks * (weeks - 1) ) / 2 + weeks * extra + (extra * (extra - 1) )/ 2; 
  }
}
