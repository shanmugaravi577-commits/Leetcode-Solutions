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

        ListNode heir = head;
        ListNode tor = head;
        while (heir != null && heir.next != null) {
            heir = heir.next.next;
            tor = tor.next;
        }
        ListNode pre = null;
        ListNode temp = tor;

       
        while (temp != null) {
            ListNode post = temp.next;
            temp.next = pre;
            pre = temp;
            temp = post;
        }
        ListNode newhead = pre;
        temp = head;

        int max = 0;
        while (newhead != null) {
            
            if ((newhead.val + temp.val)> max)
                max = newhead.val + temp.val;
            newhead = newhead.next;
            temp = temp.next;
        }

        return max;
    }
}