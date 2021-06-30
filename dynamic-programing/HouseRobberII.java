public class HouseRobberII
{
  public int houseRobber(int []A)
  {
     if(A.length == 1) return A[0];

     if(A.length == 2) return Math.max(A[0], A[1]);
    
     return Math.max(rob(A, 0, A.length - 2), rob(A, 1, A.length - 1));
  }

  public int rob(int []A, int start, int end)
  {
     int prev = A[start];
     int curr = Math.max(prev, A[start + 1]);
    
     for(int idx = start + 2; idx <= end; idx++)
     {
       int t = Math.max(A[idx] + prev, curr);
       prev = curr;
       curr = t; 
     }
     
     return curr;
  }
}
