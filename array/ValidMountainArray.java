public class ValidMountainArray
{

  public boolean mountain(int []A)
  {
     int N = A.length;
     int i = 0;

     while(i+1 < N && A[i] < A[i + 1])
      i++;

     // Not peak at first and last
     if(i == 0 || i == N - 1) return false; 
     
     while(i + 1 < N && A[i] > A[i + 1])
      i++;

     return i == N - 1;
  }

}
