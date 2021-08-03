public class ValidParenthesisString {

  public boolean validParenthesisString(String str) {
    int lo = 0;
    int hi = 0;

    for(char ch : str.toCharArray()) {
      lo  += ch == '(' ? 1 : -1;
      hi  += ch != ')' ? 1 : -1;
      
      if(hi < 0) return false;
      lo = Math.max(lo, 0);
    }

     return lo == 0;
  }

}
