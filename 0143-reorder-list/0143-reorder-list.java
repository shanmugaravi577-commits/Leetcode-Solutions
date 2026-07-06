/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode t= head;
        ListNode h=head;
        while(h != null && h.next != null)
        {
            t=t.next;
            h=h.next.next;
        }
        ListNode prev = null;
        ListNode temp = t.next;
        t.next = null;
        while(temp != null)
        {
            ListNode pos = temp.next;
            temp.next = prev;
            prev =temp;
            temp =pos;
        }
    ListNode t1 =head;
    ListNode t2 = prev;
    
    ListNode dummy = new ListNode(-1);
    ListNode t3 = dummy;
   while(t1 != null && t2 != null)
   {
     ListNode po1 = t1.next;
     ListNode po2 = t2.next;
     t3.next = t1;
     t1=po1;
     t3=t3.next;
     t3.next = t2;
     t3=t3.next;
     t2=po2;
   }
   if(t1 != null)
   {
    t3.next = t1;
    t3= t3.next;
   }
    }
}