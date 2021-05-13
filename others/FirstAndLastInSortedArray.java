
/**
*
*
* problem link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*
*
*
*
*/


import java.util.Arrays;

class FirstAndLastInSortedArray
{

 
public static void main(String[] args){
 FirstAndLastInSortedArray fs  = new FirstAndLastInSortedArray();
 int ans[] = fs.solve(new int[]{1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6, 9, 10, 11, 12, 15}, 6);

 Arrays.stream(ans).forEach(System.out::println); 

}  


 public int[] solve(int[]A, int target)
 {
    int first = search(A, target, true);

    if(first == -1)
      return new int[]{-1, -1};

    int last = search(A, target, false);

    return new int[]{first, last};
 }

 
 public int search(int []A, int target, boolean isFirst)
 {
    int begin = 0;
    int end = A.length - 1;
    
    while(begin <= end)
    {
      int mid = begin + (end - begin) / 2;
     
      if(A[mid] == target)
      {
        if(isFirst)
        {
          if(mid == begin || A[mid -1] != target ) return mid;
          end = mid - 1;
        }
        else
        {
          if(mid == end || A[mid + 1] != target) return mid;
          begin = mid + 1;
        }
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

    return -1;
 } 
 

}
