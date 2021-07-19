public class HomeworkInGivenTime
{
   public int homeworkInGivenTime(int[] startTime, int[]endTime, int queryTime)
   {
     int ans = 0;
     for(int idx = 0; idx < endTime.length; idx++)
      if(startTime[idx] <= queryTime && endTime[idx] >= queryTime) ans++;

     return ans;
   }
}
