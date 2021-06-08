public class SegmentOfOnesAndZero
{
   public boolean checkZeroOnes(String str){
       int longestZeros = 0;
       int longestOnes = 0;

       int currZeros = 0;
       int currOnes = 0;
      
       int N = str.length();

       for(int idx = 0; idx < N; idx++){
           
          if(str.charAt(idx) == '1')
          {
             currZeros = 0;
             currOnes++;
             longestOnes = Math.max(longestOnes, currOnes);
          } 
          else
          {
            currOnes = 0;
            currZeros++;
            longestZeros = Math.max(longestZeros, currZeros);
          }
       }

       return longestOnes > longestZeros;
   }
}
