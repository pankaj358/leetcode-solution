public class ClimbingStairs
{

  public int climbingStairs(int n)
  {
     int ways[] = new int[n + 1];
     
     ways[0] = 1;
     ways[1] = 1;
   
     for(int i = 2; i <= n; i++)
     {
       ways[i] = ways[i - 1] + ways[i  - 2];
     }

     return ways[n];
  }

  public static void main(String[] args)
  {
     ClimbingStairs cs = new ClimbingStairs();
     int n = 3;
     int ans = cs.climbingStairs(n);
     System.out.println(ans);
  }

}
