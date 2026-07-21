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
    void reverse(List<Integer> l,int s,int e)
    {
        int n = l.size();
        int mid = (s+e)/2;
        int j=e-1;
        for(int i= s;i<mid;i++)
        {
            int c=l.get(i);
            l.set(i,l.get(j));
            l.set(j,c);
            j--;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
       if(head == null)return head;
       List<Integer> l = new ArrayList<>();
       ListNode temp =head;
       while(temp != null)
       {
        l.add(temp.val);
        temp = temp.next;
       }
       int n= l.size();
       k=k%n;
reverse(l,0,n);
reverse(l,0,k);
reverse(l,k,n);
ListNode res = new ListNode(-1);
temp =res;
for(int i:l)
{
    temp.next = new ListNode(i);
     temp =temp.next;
}
return res.next;
    }
}