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
    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return head;
        ListNode temp = head;
        while (temp != null) {
            ListNode temp1 = temp.next;
            while (temp1 != null) {
                if (temp.val > temp1.val) {
                    int c = temp.val;
                    temp.val = temp1.val;
                    temp1.val = c;
                }
                temp1 = temp1.next;
            }
            temp = temp.next;
        }

        return head;
    }

}
