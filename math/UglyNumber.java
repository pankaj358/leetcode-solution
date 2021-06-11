public class UglyNumber
{
  public boolean uglyNumber(int N) {
    for(int i = 2; i < 6 && N > 0; i++){
       while(N % i == 0) {
           N /= i;
       }
     }

    return N == 1;
  }
}
