public class SubArrayProductLessThanK {

 public int productLessThanK(int A[], int K) {
     int cnt = 0;
     int pro = 1;

     for(int i = 0, j = 0; j < A.length; j++) {
         pro *= A[j];

         while(i <= j && pro >= K)  {
            pro /= A[i];
            i++;
         }

         cnt += j - i + 1;
      }

      return cnt;
 }

}
