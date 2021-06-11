public class LinkedListCycleII
{
  public ListNode linkedListCycle(ListNode head){
     if(head == null || head.next == null) return null;
    
     ListNode first = head;
     ListNode second = head;

     while(first != null && second != null)
     {
        first = first.next;
        if(second.next != null)
         second = second.next.next;
        else second = null;

        if(first == second) break;
     }

     if(first == second && second != null){
        second = first;
        while(first != second)
        {
          first = first.next;
          second = second.next;
        }
        return first;
     }

     return null;
  }

  class ListNode {
     ListNode next;
     int data;
  }
}
