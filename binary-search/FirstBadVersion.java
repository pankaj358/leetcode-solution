public class FirstBadVersion
{
  
  public boolean isBadVersion(int version){
     // dummy impl
    // given imp
     return true;
  }    

   public int firstBadVersion(int N)
   {
     int low = 1;
     int high = N;

     int ans = -1;

     while(low <= high)
     {
        int mid = low + (high - low) / 2;
        if(isBadVersion(mid)) 
        {
           ans = mid;
           high = mid - 1;
        }
        else
        {
           low = mid + 1;
        }
     }

     return ans;
   }

}


