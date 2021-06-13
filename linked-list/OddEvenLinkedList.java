public class OddEvenLinkedList
{
  public ListNode oddEvenLinkedList(ListNode head){
     if(head == null || head.next == null) return head;

     ListNode odd = head;
     final ListNode eHead = head.next;
     ListNode even = eHead;

     while(even != null && even.next != null) {
       odd.next = even.next;
       odd = odd.next;
       even.next = odd.next;
       even = even.next;
     }

    odd.next = eHead;
    return head;
  }

  class ListNode {
     ListNode next;
     int data;
   }
}
