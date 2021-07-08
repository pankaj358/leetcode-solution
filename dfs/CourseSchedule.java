import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class CourseSchedule
{
   private Map<Integer, Integer> color = new HashMap<>();
   private Map<Integer, List<Integer>> adjList = new HashMap<>();

   private int WHITE = 1;
   private int GRAY = 2;
   private int BLACK = 3;

   private boolean possible = true;

  
   private void dfs(int node)
   {
      if(possible == false) return;

      color.put(node, GRAY);

      for(int neighbor : adjList.getOrDefault(node, new ArrayList<>()))
      {
        if(color.get(neighbor) == GRAY) possible = false;
        else if(color.get(neighbor) == WHITE) dfs(neighbor);
      }

      color.put(node, BLACK);
   }

   public boolean canFinish(int numCourses, int [][]prerequisites)
   {
      for(int i = 0; i < numCourses; i++)
       color.put(i, WHITE);
      
      for(int i = 0; i < prerequisites.length; i++)
      {
        int source = prerequisites[i][1];
        int dest   = prerequisites[i][0];
        
        List<Integer> list = adjList.getOrDefault(source, new ArrayList<>());
        list.add(dest);
        
        adjList.put(source, list);
      }
     
      for(int i = 0; i < numCourses; i++)
      {
         if(color.get(i) == WHITE) dfs(i);
      }
     
      return possible;
   }  
  
}
