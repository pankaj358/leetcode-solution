
import java.util.Map;
import java.util.HashMap;

public class XofKind
{
 

  public static void main(String[] args)
  {
     XofKind kind = new XofKind();
     int[] deck = {1,2,3,4,4,3,2,1};
     System.out.println(true == kind.hasGroupSizeX(deck));
  }

  public boolean hasGroupSizeX(int[] deck)
  {
     Map<Integer, Integer> map = new HashMap<>();
   
     for(int idx : deck)
     {
        int val = map.getOrDefault(idx, 0);
        map.put(idx, val + 1);
     }

   
    int gcd = -1;

    for(Map.Entry<Integer, Integer> entry : map.entrySet())
    {
       if(gcd == -1)
       {
         gcd = entry.getValue();
       }
       else
       {
         gcd = gcd(gcd, entry.getValue());
       }
    }

    return gcd >= 2;

  }

  
  private int gcd(int a, int b)
  {
     if(a == 0) return b;

     return gcd(b % a, a);
  }

}
