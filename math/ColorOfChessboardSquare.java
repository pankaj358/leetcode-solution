public class ColorOfChessboardSquare
{
  public boolean colorOfChessboardSquare(String coordinate)
  {
    return ((int) (coordinate.charAt(0) + coordinate.charAt(1))) == 1; 
  }
}
