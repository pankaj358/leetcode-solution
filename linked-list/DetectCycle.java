public class DetectCycle
{
   public boolean detectCycle(ListNode root) { 
   
   if(root == null || root.next == null) return false;

   ListNode first = root;
   ListNode second = root;
 
   while(first != null && second != null){
     first = first.next;
     if(second.next != null)
       second = second.next.next;
     else second = null;


     if(first == second) break;   
   }

    return first == second && second != null;   

  }

  class ListNode{
     ListNode next;
     int val;
  }
}


