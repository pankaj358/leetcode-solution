/*
*
*
* problem link : https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/593/week-1-april-1st-april-7th/3696/
*
*
*
*/

public class MyCircularQueue
{
 
   private int queue[];
   private int count = -1;
   private int front = 0;
   private int size  = 0;

    public MyCircularQueue(int k) {
        this.queue = new int[k];
        this.size = k;
    }
    
    public boolean enQueue(int value) {
        
        if(isFull()) return false;
        
        queue[(++count) % size] = value;
        
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        front++;
        return true;
        
    }
    
    public int Front() {
        if(isEmpty()) return - 1;
        return queue[front % size];
    }
    
    public int Rear() {
      if(isEmpty()) return - 1;
      return queue[count % size];
    }
    
    public boolean isEmpty() {
        return (count - front) == -1;
    }
    
    public boolean isFull() {
        return ((count - front + 1) == size);
        
    }  

}
