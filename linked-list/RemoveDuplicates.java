public class RemoveDuplicates
{
  public ListNode removeDuplicates(ListNode head) {
    ListNode curr = head;
    while(curr != null && curr.next != null){
      ListNode t = curr.next;
      while(t != null && t.val == curr.val){
          t = t.next;
      }
      curr.next = t;
      curr = curr.next;
    }
    return head;
  }

  class ListNode{
   ListNode next;
   int val;
  }
}
