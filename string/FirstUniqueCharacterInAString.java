public class FirstUniqueCharacterInAString
{
   public int firstUniqueChar(String str)
   {
      int count[] = new int[26];
      int N = str.length();      

      for(int i = 0; i < N; i++)
      {
         int idx = str.charAt(i) - 'a';
         count[idx]++;
      }

      for(int i = 0; i < N; i++)
      {
        int idx = str.charAt(i) - 'a';
        if(count[idx] == 1) return i;
      }

      return -1;
   }

   public static void main(String []args)
   {
      FirstUniqueCharacterInAString ob = new FirstUniqueCharacterInAString();
      String str = "leetcode";
      int ans = ob.firstUniqueChar(str);
      int expected = 0;

      System.out.println(ans == expected);
   }
}
