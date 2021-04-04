public class SearchInsertElement
{

 public static void main(String[] args)
 {
   SearchInsertElement ele = new SearchInsertElement();
   int ans = ele.searchInsertElement(new int[] {1, 4, 5, 9, 10}, 6);
   System.out.println(ans);
 }

 
  public int searchInsertElement(int[] A, int target)
  {
    int begin = 0;
    int end = A.length;

    int count = -1;

    while(begin <= end)
    {
      int mid = begin + (end - begin) / 2;
     
      if(mid == A.length) return begin;
      
      if(A[mid] == target)
      {
        count  = mid;
        break;
      }
      else if(A[mid] > target)
      {
        end = mid - 1;
      }
      else 
      {
        begin = mid + 1;
      }
   
    }

   if(count == -1) return begin;
    return count;
  }

}
