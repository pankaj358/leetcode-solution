public class PlusOne
{
    public static int[] plusOne(int []A)
    {
       int N = A.length;
       for(int idx = N - 1; idx >= 0; idx--)
       {
         if(A[idx] < 9)
         {
           A[idx]++;
           return A;
         }
         A[idx] = 0;
       }
      int newNumber[] = new int[N + 1];
      newNumber[0] = 1;
      return newNumber;
    }
}
