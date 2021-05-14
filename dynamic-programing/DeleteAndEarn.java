public class DeleteAndEarn
{
   public int solve(int []A)
   {
     int count[] = new int[10001];
     for(int x : A)
       count[x]++;
     
     int avoid = 0;
     int using = 0;
     int prev = -1;

     for(int i = 0; i < A.length; i++)
     {
       if(count[i] > 0)
       {
         int m = Math.max(avoid, using);
         if(i - 1 != prev)
         {
           using = i * count[i] + m;
           avoid = m;
         }
         else
         {
           using = i * count[i] + avoid;
           avoid = m;
         }
        prev = i;
       }
     }
     return Math.max(avoid, using);
   }

   public static void main(String[] args)
   {
      DeleteAndEarn delAndEarn = new DeleteAndEarn();
      int[]A = {2, 2, 3, 3, 3, 4};
      int actual = delAndEarn.solve(A);
      int expected = 9;

      System.out.println(actual == expected);
   }
}
