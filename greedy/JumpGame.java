public class JumpGame
{

 public boolean solve(int [] A)
 {
    int farthestIndex = 0;
    
    for(int i = 0; i < A.length; i++)
    {
      if(farthestIndex < i)  return false;
      
      farthestIndex = Math.max(farthestIndex, i + A[i]);
    }

    return true;
 }

  public static void main(String[] args)
  {
     JumpGame jg = new JumpGame();
    
     int A[] = {2, 3, 1, 1, 4};
    
     boolean actual = jg.solve(A);
    
     boolean expected = true;

     System.out.println(actual == expected);
    
  }

}
