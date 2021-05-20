public class MajorityElement
{
   public int solve(int []A)
   {
     int cnt = 1;
     int curr = A[0];
     
     for(int i = 1; i < A.length; i++)
     {
        if(cnt == 0)
        {
           curr = A[i];
           cnt++;
        }
        else if(A[i] == curr)
        {
           cnt++;
        }
        else
        {
           cnt--;
        }
     }
   
     return curr;  
 
   }
}
