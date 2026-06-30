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
    public int pairSum(ListNode head) {
       ListNode temp = head;
       List<Integer> l = new ArrayList<>();
       while(temp != null)
       {
        l.add(temp.val);
        temp = temp.next;
       } 
       int n= l.size();
       int max =0;
       for(int i=0;i<n/2;i++)
       {
        int s=l.get(i)+l.get(n-1-i);
         if(s>max)
          max = s;
       }
    return max;
    }
}