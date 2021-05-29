
import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberOfDifferentInteger
{
  public static int numberOfDifferentInteger(String str)
  {
     return Arrays.stream(str.replaceAll("[a-z]+", " ")
          .split(" "))
          .filter(s -> s.trim().length() !=0 )
          .map(s ->s.replaceFirst("^0+", "")) 
          .collect(Collectors.toSet()).size();
  }
 
  public static void main(String[] args) 
  {
      System.out.println(1 == numberOfDifferentInteger("a1b01c001"));
  }
}
