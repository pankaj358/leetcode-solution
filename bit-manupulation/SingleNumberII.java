public class SingleNumberII {
  public int singleNumberII(int []A) {
     int first = 0;
     int second = 0;

     for(int idx = 0; idx < A.length; idx++) {
         second = second | (first & A[idx]);
         first = first ^ A[idx];
         int verify = ~(first & second);
         first = first & verify;
         second = second & verify;
     }

     return first; 
  }
}
