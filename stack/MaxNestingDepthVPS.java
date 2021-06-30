public class MaxNestingDepthVPS 
{
  public int []maxDepth(String seq)
  {
    boolean open = false;
    boolean close = false;

    int ans[] = new int[seq.length()];
   
    for(int idx = 0; idx < seq.length(); idx++)
    {
      if(seq.charAt(idx) == '(')
      {
        if(close) 
        {
          ans[idx] = 1;
          close = false;
        }
        else 
        {
          ans[idx] = 0;
          close = true;
        }
      }
      else
      {
        if(open) 
        {
          ans[idx] = 1;
          open = false;
        }
        else
        {
          ans[idx] = 0;
          open = true;
        }
      }
    }
    return ans;
  }
}
