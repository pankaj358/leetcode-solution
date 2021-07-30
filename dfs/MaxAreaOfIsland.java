public class MaxAreaOfIsland {

   public int maxAreaIsland(int [][] grid) {
     boolean [][] seen = new boolean[grid.length][grid[0].length];
     int ans = 0;

     for(int row = 0; row < grid.length; row++) {
        for(int col = 0; col < grid[0].length; col++) {
           ans = Math.max(ans, dfs(row, col, grid, seen)); 
        }
     }

     return ans;
   }

   private int dfs(int row, int col, int [][] grid, boolean [][]seen) {
      if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || seen[row][col] || grid[row][col] == 0)
        return 0;
      
      seen[row][col] = true;  
      
      return 1 +
           dfs(row + 1, col, grid, seen)
           + dfs(row - 1, col, grid, seen)
           + dfs(row, col + 1, grid, seen) 
           + dfs(row, col - 1, grid, seen); 
   } 
}
