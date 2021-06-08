public class SingleNumber
{
  public int singleNumber(int[] A) {
     int ans = 0;
     for(int num : A)
       ans ^= num;

     return ans;
  }
}
