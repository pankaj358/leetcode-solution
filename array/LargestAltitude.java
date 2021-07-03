public class LargestAltitude
{
  public int largestAltitude(int []gain)
  {
     int max = 0;
     int currAlt = 0;
     for(int idx = 0; idx < gain.length; idx++)
     {
       currAlt += gain[idx];
       max = Math.max(max, currAlt);
     }
     return max;
  }
}
