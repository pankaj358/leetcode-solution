public class IntersectionOfLinkedList
{
  public ListNode intersectionNode(ListNode headA, ListNode headB){
    if(headA == null || headB == null) return null;

    ListNode a = headA;
    ListNode b = headB;

    while(a != b )
    {
      a = a == null ? headB : a.next;
      b = b == null ? headA : b.next;
    }
   
    return a;    
   
  }

  class ListNode {
    ListNode next;
    int val;
  }
}
