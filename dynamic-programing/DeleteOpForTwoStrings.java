public class DeleteOpForTwoStrings
{

  public int deleteOperationForTwoStrings(String str1, String str2)
  {
   
    int M = str1.length();
    int N = str2.length();
    int lcs[][] = new int[M + 1][N  + 1];

    for(int idx = 0; idx <= M; idx++)
     lcs[idx][0] = 0;
  
    for(int idx = 0; idx <= N; idx++)
     lcs[0][idx] = 0;

    for(int i = 1; i <= M; i++)
    {
      for(int j = 1; j<= N; j++)
      {
        if(str1.charAt(i - 1) == str2.charAt(j - 1))
        {
          lcs[i][j] = 1 + lcs[i-1][j-1];
        }
        else 
        {
          lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
        }
      }
    }   

    int max = lcs[M][N];    

    return M - max + N - max; 
  }

}
