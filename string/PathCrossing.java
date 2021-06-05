import java.util.Set;
import java.util.HashSet;
import java.util.Objects;
public class PathCrossing
{

   public boolean isPathCrossing(String path) {
    
        Point origin = new Point(0, 0);
        Set<Point> points = new HashSet<>();
        
        points.add(origin);
        
        for(int i = 0; i < path.length(); i++)
        {
            if(path.charAt(i) == 'N')
            {
                Point point = new Point(origin.x + 1, origin.y);
                if(points.contains(point))
                    return true;
               points.add(point);
               
               origin = point; 
            }
            else if(path.charAt(i) == 'S')
            {
                Point point = new Point(origin.x - 1, origin.y);
                if(points.contains(point))
                    return true;
                
                points.add(point);
                
                origin = point;
            }
            else if(path.charAt(i) == 'E')
            {
                Point point = new Point(origin.x, origin.y + 1);
                if(points.contains(point))
                    return true;
                
                points.add(point);
                origin = point;
            }
            else if(path.charAt(i) == 'W')
            {
                Point point = new Point(origin.x, origin.y - 1);
                if(points.contains(point))
                    return true;
                
                points.add(point);
                origin = point;
            }
        }
        
        return false;
        
        
        
    }
    
   
    class Point {

     private int x;
     private int y;

     public  Point(int x, int y )
     {
         this.x = x;
         this.y = y;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
 
}
