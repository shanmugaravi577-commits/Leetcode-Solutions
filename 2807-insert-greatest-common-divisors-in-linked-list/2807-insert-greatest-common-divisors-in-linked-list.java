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
        List<Integer> l = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            l.add(temp.val);
            temp =temp.next;
        }
        System.out.println(l);
        
        for(int i=0;i<l.size()-1;i++)
        {
            int g = gcd(l.get(i),l.get(i+1));
            l.add(i+1,g);
            i++;
        }
        
        ListNode res = new ListNode(-1);
       temp =res;
       for(int k:l)
       {
        temp.next = new ListNode(k);
        temp =temp.next;
       }
    return res.next;
    }
}