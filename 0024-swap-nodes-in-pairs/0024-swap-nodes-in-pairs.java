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
    public ListNode swapPairs(ListNode head) {
       List<Integer> l = new ArrayList<>();
       ListNode temp = head;
       while(temp != null)
       {
        l.add(temp.val);
        temp = temp.next;
       }
       int n= l.size();
       for(int i=0;i<n-1;i+=2)
       {
        int c = l.get(i);
        l.set(i,l.get(i+1));
        l.set(i+1,c);
       }
       ListNode dummy = new ListNode(-1);
       ListNode temp2 = dummy;
       for(int i=0;i<n;i++)
       {
         temp2.next = new ListNode(l.get(i));
         temp2 = temp2.next;
       }
    return dummy.next;
    }
}