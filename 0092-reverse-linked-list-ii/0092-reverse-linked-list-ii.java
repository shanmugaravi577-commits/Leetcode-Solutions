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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> l = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            l.add(temp.val);
            temp = temp.next;
        }
        int mid = (left+right)/2;
        int j=right-1;
        for(int i=left-1;i<mid;i++)
        {
            int c= l.get(i);
            l.set(i,l.get(j));
            l.set(j,c);
            j--;
        }
        System.out.println(l);
    ListNode res = new ListNode(-1);
    temp = res;
    for(int k:l)
    {
        temp.next = new ListNode(k);
        temp =temp.next;
    }
     return res.next;   
    }
}