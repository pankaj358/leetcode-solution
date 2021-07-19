import java.util.Random;

public class LinkedListRandomNode
{
  private Node head;
  private Random random;

  public LinkedListRandomNode(Node head)
  {
     this.head = head;
     random = new Random();
  }

  public int getRandom()
  {
    int scope = 1; 
    int chosenValue = 0;
    Node curr = this.head;
    
    while(curr != null)
    {
       if(Math.random() < 1.0 / scope)
       {
         chosenValue = curr.val;
       }

       scope +=1;
       curr = curr.next;
    }

    return chosenValue;
  }
  
}

class Node
{
   int val;
   Node next;
}
