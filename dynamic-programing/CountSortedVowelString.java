public class CountSortedVowelString
{
  public int countVowelString(int N)
  {
    int a = 1;
    int e = 1;
    int i = 1;
    int o = 1;
    int u = 1;

    while(N > 1)
    {
      a  = a + e + i + o + u;
      e = e + i + o + u;
      i = i + o + u;
      o = o + u ;
      u = u;
    }

    return a + e + i + o + u;
  }
}
