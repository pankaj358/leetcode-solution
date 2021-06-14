public class RotateArray
{
   public void rotate(int[] A, int k) {
     k = k % A.length;
     reverse(A, 0, A.length - 1);
     reverse(A, 0, k - 1);
     reverse(A, k , A.length - 1);
   }

   private void reverse(int[] A, int start, int end) {
      while(start < end){
        int t = A[start];
        A[start] = A[end];
        A[end] = t;
        end--;
        start++;
     }
   }
}
