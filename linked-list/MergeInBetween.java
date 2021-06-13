public class MergeInBetween
{
   public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2){
     ListNode curr = list1;
     int cnt = 1;

     while(cnt < a){
       curr = curr.next;
       cnt++;
     }

    ListNode t = curr.next;
    curr.next = list2;
    cnt = b - a;

    while(cnt > 0 && t != null){
      cnt--;
      t = t.next;
    }    

   while(curr.next != null){
     curr = curr.next;
   } 
   
   curr.next = t.next;

   return list1;

 }

   class ListNode {
      ListNode next;
      int val;
   }
}
