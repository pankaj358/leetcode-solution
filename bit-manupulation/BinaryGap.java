public class BinaryGap
{
   public int binaryGap(int N) {
     while((N & 1) == 0) N >>=1;

     if( N <= 1) return 0;

     int max = 0; 
     int start = 0;
     int end = 0;

     while(N != 0)
     {
       if((N & 1) == 0) end++;
       else {
         max = Math.max(max, 1 + end - start);
         start = end;
       }

       N >>=1;
     }

     max = Math.max(max, 1 + end - start);

     return max; 
   }
}
