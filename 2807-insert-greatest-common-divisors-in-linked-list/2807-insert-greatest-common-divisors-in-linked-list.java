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
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int c =a%b;
            a=b;
            b=c;
        }
    return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null||head.next == null)return head;
        ListNode t1 = head;
       ListNode t2 =head.next; 
        while(t2 != null)
        {
            int g = gcd(t1.val,t2.val);
            ListNode newnode = new ListNode(g);
            newnode.next =t1.next;
            t1.next =newnode;
            t1=t1.next.next;
            t2=t2.next;
        }

      return head;  
    }
}