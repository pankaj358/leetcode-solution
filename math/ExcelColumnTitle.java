public class ExcelColumnTitle
{
    public String excelColumnTitle(int columnNumber)
    {
       String ans = "";
       while(columnNumber != 0)
       {
          int mod = --columnNumber % 26;
          char ch = (char) (65 + mod);
          ans = ch + ans;
          columnNumber /=26;
       }
 
       return ans;
    }
}
