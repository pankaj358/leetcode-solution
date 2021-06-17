public class  NumberReduceToZero
{
  public int numberOfStepsToReduceNumberToZero(int N) {
     int count = 0;
     if((N & 1) != 0) {
           count = 1;
           N = N - 1;
      }

      while(N > 0) {
        count++;
        N = N >> 1;
        if((N & 1) != 0 ) {
           count++;
         }
      }

     return count;
   }
}
