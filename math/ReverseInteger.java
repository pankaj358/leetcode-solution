public class ReverseInteger
{

  public int reverseInteger(int x)
  {
     boolean isNeg = false;
 
     if(x < 0)
     {
        isNeg = true;
        x *=-1;
     }

     int limit = Integer.MAX_VALUE;

     int ans = 0;
     
     while(x > 0)
     {
       int tmp = x % 10;
       
       if(limit <= ans * 10L) 
        {
           ans = 0;
           break;
        }
        ans = ans * 10 + tmp;
        x /= 10;
     }

     if(isNeg) ans *=-1;

     return ans;
   
  }

}
