public class LongPressedName
{
   public boolean isLongPressedName(String name, String typed)
   {
      int N1 = name.length();
      int N2 = typed.length();
      
      if(N2 < N2) return false;

      int idx1 = 0;
      int idx2 = 0;

      while(idx1 < N1)
      {
        int cnt1 = 1;
        char ch = name.charAt(idx1);

        while((cnt1 + idx1) < N1 && ch == name.charAt(idx1 + cnt1))
         cnt1++;

        idx1 += cnt1;
        int cnt2 = 0;

        while((cnt2 + idx2) < N2 && ch == typed.charAt(idx2 + cnt2))
          cnt2++;

        idx2 += cnt2;

         if(cnt2 < cnt1) return false;        
      }

      return idx2 == N2;
   }
}
