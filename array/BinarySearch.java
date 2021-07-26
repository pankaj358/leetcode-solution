public class BinarySearch
{
  public int binarySearch(int []A,int target)
  { 
    int left = 0;
    int right = A.length - 1;

    while(left <= right)
    {
      int mid = left + (right - left) / 2;

      if(A[mid] == target)
        return mid;
     else if(A[mid] > target)
       left = mid + 1;
     else 
       right = mid - 1; 
     
    }
    
    return -1;     
  }
}
