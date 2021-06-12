public class ReverseLinkedList
{
  public ListNode reverseLinkedList(ListNode head)
  {
    ListNode curr = head;
    ListNode prev = null;
   
    while(curr != null) {
       ListNode t = curr.next;
       curr.next = prev;
       prev = curr;
       curr = t;
    }

    return prev;
  }
  
  class ListNode {
    ListNode next;
    int val;
  }
}
