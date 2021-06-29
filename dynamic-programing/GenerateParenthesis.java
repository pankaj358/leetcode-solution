import java.util.List;
import java.util.ArrayList;

public class GenerateParenthesis{

 List<String> generateParenthesis(int n) {
   List<String> ans = new ArrayList<>();

    if(n == 0) ans.add("");
    else {
       for(int idx = 0; idx < n; idx++) 
         for(String left: generateParenthesis(idx))
            for(String right : generateParenthesis(n - idx - 1))
                ans.add("(" + left + ")" + right);
    }
    return ans;
 }

}
