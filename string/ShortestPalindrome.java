public class ShortestPalindrome {

  private int[] kmptable(String str) {
    int []table = new int[str.length()];

    int i = 1;
    int j = 0;    

    while(i < str.length()) {
       
       if(str.charAt(i) == str.charAt(j)) {
          table[i] = j + 1;
          j++;
        }
        else {
             j = table[Math.max(0, j - 1)];
             if(str.charAt(i) == str.charAt(j)) {
                table[i] = 1 + j;
                j++;
             }
         }

        i++;

     }    
 
    return table;
  }

  public String shortestPalindrome(String str) {
     String tmp = str + "#" + new StringBuilder(str).reverse().toString();
     int []table = kmptable(tmp);
     return new StringBuilder(str.substring(table[table.length - 1])).reverse().toString() + str;
  }

}
