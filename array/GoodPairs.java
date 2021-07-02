public class GoodPairs
{
    public int goodPairs(int []A)
    {
       int []count = new int[105];
       for(int idx = 0; idx < A.length; idx++)
       {
          count[A[idx]]++;
       }

       int ans = 0;
      
       for(int idx = 0; idx < count.length; idx++)
       {
         if(count[idx] > 1)
         {
            ans += ((count[idx] * (count[idx] - 1))/ 2);
         }
       }

       return ans;
    } 
}
