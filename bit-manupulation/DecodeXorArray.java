public class DecodeXorArray
{
   public int[] decodeXORArray(int[] encoded, int first){
      int []decode = new int[encoded.length + 1];
      decode[0] = first;
      for(int idx = 1; idx <= encoded.length; idx++){
        decode[idx] = first ^ encoded[idx-1];
        first = decode[idx]; 
      }
      return decode;
   }
}
