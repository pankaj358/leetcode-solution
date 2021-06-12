public class MiddleOfLinkedList
{
   public ListNode middleOfLinkedList(ListNode head){
     ListNode first = head;
     ListNode second = head;

     while(second.next != null){
        first = first.next;
        if(second.next.next != null)
          second = second.next.next;
        else
          second = second.next;
     }

     return first;
   }

   class ListNode {
    ListNode next;
    int val;
   }
}
