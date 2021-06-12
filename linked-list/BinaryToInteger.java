public class BinaryToInteger
{
  public int binaryToIntger(ListNode head){
    int ans = 0;
    while(head != null)
    {
       ans = ans * 2 + head.val;
       head = head.next;
    }
    return ans;
  }

  class ListNode {
    int val;
    ListNode next;
  }
}
