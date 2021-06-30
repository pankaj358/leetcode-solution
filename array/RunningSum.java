public class RunningSum{

  public int[] runningSum(int []A){
    int []ans = new int[A.length];
    ans[0] = A[0];
    for(int idx = 1; idx < A.length; idx++) {
          ans[idx] = ans[idx - 1] + A[idx];
     }
    return ans;
  }

}
