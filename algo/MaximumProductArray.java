public class MaximumProductArray {

  public int maximumProductArray(int []A) {
    int N = A.length;
    int res = A[0];

    int l = 0;
    int r = 0;

    for(int idx = 0; idx < N; idx++) {
      l = (l == 0 ? 1 : l) * A[idx];
      r = (r == 0 ? 1 : r) * A[N - idx - 1];
      res = Math.max(res, Math.max(l, r));
    }
 
    return res;
  }

}
