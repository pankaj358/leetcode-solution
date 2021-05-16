public class Fibo
{
   public static void main(String[] args) 
   {
      int N = 10;
      
     int []dp = new int[N + 1];
     dp[0] = 0;
     dp[1] = 1;
     
      for(int i = 2; i <= N; i++)
      {
         dp[i] = dp[i - 1] + dp[i  - 2];
        
         System.out.println("i >> " + i  + " value >> " + dp[i]);
      }

      int first = 0; 
      int second = 1;
   
      System.out.println();
    
      for(int i = 2;  i <= N; i++)
      {
         int tmp = first + second;
         first = second;
         second = tmp;
         System.out.println("i >> " + i  + " value >> " + second); 
      }
   }
}
