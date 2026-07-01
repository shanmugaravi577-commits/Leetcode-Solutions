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
        if(head == null )return null;
        if(head.next == null)return head;
        ListNode pre = head;
        ListNode temp = head.next;
        head=head.next;
        while(pre != null)
        {
            ListNode post = temp.next;
            ListNode dummy =pre;
             temp.next = pre;
            pre.next = post;
            pre = pre.next;
            if(pre == null || pre.next == null)break;
            temp = pre.next;
            dummy.next = temp;
           
        }
        return head;
    }
}