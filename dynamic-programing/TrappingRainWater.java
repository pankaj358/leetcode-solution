public class TrappingRainWater
{

  public int solve(int[] A)
  {
     int leftMax = 0;
     int rightMax = 0;
     int left = 0;
     int right = A.length - 1;

     int ans = 0;  

     while(left < right )
     {
        if(A[left] <= A[right])
        {
           if(A[left] >= leftMax)
           {
             leftMax = A[left];
           }
           else
           {
             ans+= leftMax - A[left];
           }
          left++;
        }
        else
        {
           if(A[right] >= rightMax)
           {
             rightMax = A[right];
           }
           else
           {
              ans+= rightMax - A[right];
           }
          right--;
        }
     }
     return ans;
  } 


  public static void main(String[] args)
  {
     TrappingRainWater trp = new TrappingRainWater();
     int ans = trp.solve(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
     System.out.println(ans);
  }
}
