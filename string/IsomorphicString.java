public class IsomorphicString
{
   public boolean isIsomorphicString(String s, String t)
   {
      int []m1 = new int[256];
      int []m2 = new int[256];
     
      int N = s.length();    

      for(int i = 0; i < N; i++ )
      {
         if(m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
         m1[i] = i + 1;
         m2[i] = i + 2;
      }
    
      return true; 
    
   }
}
