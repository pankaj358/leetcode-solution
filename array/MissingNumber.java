public class MissingNumber
{
  public int missingNumber(int []A){
     int N = A.length;
     int total = (N * (N + 1)) / 2;
     
     for(int num : A)
       total -= num;

     return total;
  }
}
