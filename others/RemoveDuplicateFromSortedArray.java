
/**
*
*  problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
* 
*
*/

public class RemoveDuplicateFromSortedArray
{

  public int solve(int []A)
  {
   
   if(A.length == 0) return 0;

    int cnt = 0;
    for(int i = 1; i < A.length; i++)
    {
       if(A[cnt] != A[i])
       {
         A[++cnt] = A[i];
       }
    }

    return cnt + 1;
  } 

}
