public class SortedListToBST
{
   public TreeNode sortedListToBST(ListNode head)
   {
      return rec(head, null);     
   }

   public TreeNode rec(ListNode head, ListNode tail)
   {
      if(head == null || head == tail)
       return null;
      
      ListNode mid = mid(head, tail);
      
      TreeNode root = new TreeNode(mid.val);
      if(head == mid) return root;
 
      root.left = rec(head, mid); 
      root.right = rec(mid.next, tail);
     
      return root;
   }

   public ListNode mid(ListNode head, ListNode tail)
   {
      ListNode mid = head;

      while(mid != tail)
      {
         mid = mid.next;
         if(mid == tail) return head;
         mid = mid.next;
         head = head.next;
      }
 
      return head;
   }


   class ListNode
   {
      ListNode next;
      int val;
   }

   class TreeNode
   {
      TreeNode left;
      TreeNode right;
      int val;

      TreeNode(int val)
      {
        this.val = val;
      }
   }
}
