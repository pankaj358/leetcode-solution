public class ExcelColumnNumber
{
   public int excelColumnNumber(String columnTitle)
   {
      int sum = 0;
      for(char ch : columnTitle.toCharArray())
      {
         sum *= 26;
         sum += ch - 'A' + 1;
      }

      return sum;
   }
}
