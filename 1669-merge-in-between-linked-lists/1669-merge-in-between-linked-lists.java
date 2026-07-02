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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
     ListNode temp = list1;
     int c=0;
      List<Integer> l = new ArrayList<>();
      while(temp != null)
      {
         if(c<a)
         l.add(temp.val);
         else if (c >= b+1)
         l.add(temp.val);
         c++;
         temp = temp.next;
      }
      ListNode res = new ListNode(-1);
      ListNode temp2 =res;
      int n=l.size();
      for(int i=0;i<n;i++)
      {
         if(i+1 < a)
         {
            temp2.next = new ListNode(l.get(i));
            temp2 = temp2.next;
         }
         else if(i+1 == a)
         {
            temp2.next =  new ListNode(l.get(i));
            temp2 =temp2.next;
            while(list2 != null)
            {
                temp2.next = new ListNode(list2.val);
                temp2 = temp2.next;
                list2 =list2.next;
            }
         } 
         else
         {
          temp2.next = new ListNode(l.get(i));
          temp2 = temp2.next;
         }

      }
    return res.next;

    }
}