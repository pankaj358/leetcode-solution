
import java.util.PriorityQueue;

public class KthLargest{

  private int k;
  private PriorityQueue<Integer> pq;

  public KthLargest(int k, int A[])
  {
    this.k = k;
    pq = new PriorityQueue(k);
   
    for(int i = 0; i < A.length; i++)
    {
       pq.offer(A[i]);
       if(pq.size() > k) pq.poll();
    }  
    
  }

  public int add(int val)
  {
     pq.offer(val);
 
     if(pq.size() > k)
      pq.poll();

     return pq.peek();
  }


}
