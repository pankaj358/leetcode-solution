public class MergeKSortedList
{
  public ListNode mergeKSortedList(ListNode []lists)
  {

    if(lists.length == 1) return lists[0];

    if(lists.length == 0) return null;

    ListNode head = mergeTwoList(lists[0], lists[1]);
  
    for(int i = 2 ; i < lists.length ; i++)
    {
      head = mergeTwoList(head, lists[i]);
    }
    return head;
  }


 private ListNode mergeTwoList(ListNode l1, ListNode l2)
 {
   ListNode h = new ListNode(0);
   ListNode ans = h;

   while(l1 != null && l2 != null)
   {
     if(l1.val < l2.val)
     {
       h.next = l1;
       l1 = l1.next;
       h = h.next;
     }
     else
     {
       h.next = l2;
       l2 =  l2.next;
       h  =  h.next;
     }
   }

   if(l1 == null)
      h.next = l2;
   if(l2 == null)
      h.next = l1;

   return ans.next;
    
 }


  /**
 * Definition for singly-linked list.
 */
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

}
