public class CountSegment
{
   public int countSegment(String str)
   {
      int res = 0;
      for(int i = 0; i < str.length(); i++)
      {
        if(str.charAt(i) != ' ' && (i == 0 || str.charAt(i -1) == ' ')) res++;
      }
      return res;
   }
}
