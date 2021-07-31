import java.util.List;
import java.util.ArrayList;

public class DiffWaysAdd {

   public List<Integer> diffWaysAdd(String input) {
     List<Integer> list = new ArrayList<>();

     for(int idx = 0; idx < input.length(); idx++) {
       if(input.charAt(idx) == '+' || input.charAt(idx) == '-' || input.charAt(idx) == '*') {
          List<Integer> part1 = diffWaysAdd(input.substring(0, idx));
          List<Integer> part2 = diffWaysAdd(input.substring(idx + 1));
          
          for(int a : part1) {
            for(int b : part2) {
                 int c = 0;
                 if(input.charAt(idx) == '+') c = a + b;
                 if(input.charAt(idx) == '-') c = a - b;
                 if(input.charAt(idx) == '*') c = a * b;
                 list.add(c); 
             }
          }
          
        }
     }

     if(list.size() == 0) 
        list.add(Integer.valueOf(input));

     return list;
   }
}
