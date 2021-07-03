public class MatrixDiagonalSum
{
  public int matrixDiagonalSum(int [][]mat)
  {
    int sum = 0;
   
    for(int rowAndCol = 0; rowAndCol < mat.length; rowAndCol++)
    {
       sum+=mat[rowAndCol][rowAndCol];
       mat[rowAndCol][rowAndCol]=0;
    }

    for(int col = mat.length - 1, row = 0; col >= 0; col--, row++)
      sum += mat[row][col];

    return sum;
  }
}
