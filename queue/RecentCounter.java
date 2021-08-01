import java.util.Queue;
import java.util.LinkedList;

public class RecentCounter {

 private Queue<Integer> queue = new LinkedList<>();

  public int ping(int t) {
     while(!queue.isEmpty() && t - queue.peek() > 3000) 
      queue.poll();

      queue.add(t);
      return queue.size();
  }
}
