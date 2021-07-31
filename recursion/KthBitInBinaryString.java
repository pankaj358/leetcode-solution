public class KthBitInBinaryString {

   public char kthBitInBinaryString(int N, int K) {
     if(N == 1) return '0';

     int len = (1 << N) - 1;
     
     if(K == len / 2 + 1 ) return '1';
     
     else if( K > len / 2 + 1)
        return kthBitInBinaryString( N-1, len - K + 1) == '0' ? '1' : '0';
     else 
       return kthBitInBinaryString(N-1, K); 
     
   }   

}
