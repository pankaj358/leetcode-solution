public class BulbSwitcherIII {

  public int numTimesAllBlue(int[] light) {
    int max = 0;
    int allBlues = 0;
    
    for(int idx = 0; idx < light.length; idx++) {
       max = Math.max(max, light[idx]);
       if((idx + 1) == max) allBlues++;
     }
    
    return allBlues;
  }


}
