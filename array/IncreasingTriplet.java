public class IncreasingTriplet
{
  public boolean increasingTriplet(int []A)
  { 
     int small = Integer.MAX_VALUE;
     int big = Integer.MAX_VALUE;

     for(int N : A)
     {
        if(N <= small) small = N;
        else if(N <= big) big = N;
        return true;
     }

     return false;
  }
}
