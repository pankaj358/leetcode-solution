public class CountSegmentI
{
  public int countSegment(String str)
  {
    if(str.trim().length() == 0) return 0;

    return str.trim().split("\\s+").length;
  }
}
