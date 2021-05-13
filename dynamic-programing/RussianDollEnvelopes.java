import java.util.Arrays;

public class RussianDollEnvelopes
{

  class Pair implements Comparable<Pair>{
    int width;
    int height;

    public Pair(int width, int height)
    {
      this.width = width;
      this.height = height;
    }

    public int compareTo(Pair pair)
    {
       if(this.width == pair.width)
         return pair.height - this.height;
       return this.width - pair.width;
    }
   
  }
 
  public int solve(int [][] envelopes)
  {
    int N = envelopes.length;
    int lis[] = new int[N];
    Pair pairs[] = new Pair[N];
    
    for(int i = 0; i < N; i++)
    {
      Pair pair = new Pair(envelopes[i][0], envelopes[i][1]);
      pairs[i] = pair;
    }
 
    Arrays.sort(pairs);
    
    lis[0] = 1;
    
    for(int i = 1; i < N; i++)
    {
       lis[i] = 1;
       for(int j = 0; j < i; j++)
       {
          if(pairs[i].width > pairs[j].width && pairs[i].height > pairs[j].height)
          {
             lis[i] = Math.max(lis[i], lis[j] + 1);
          }
       }
    }
   
    int ans = 0;

    for(int i = 0; i < N; i++)
    {
       ans = Math.max(ans, lis[i]);
    }    

    return ans;
   
  }

  public static void main(String[] args)
  {
    RussianDollEnvelopes rde = new RussianDollEnvelopes();
    int[][] envelopes = {{5,4}, {6, 4}, {6, 7}, {2, 3}};
    int actual = rde.solve(envelopes);
    int expected = 3;
    System.out.println(actual == expected);  
  }

}
