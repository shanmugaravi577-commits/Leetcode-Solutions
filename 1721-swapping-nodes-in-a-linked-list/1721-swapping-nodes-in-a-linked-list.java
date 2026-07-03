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
    public ListNode swapNodes(ListNode head, int k) {
        
               ListNode temp =head;
               int l=0;
               while(temp != null)
               {
                l++;
                temp =temp.next;
               }
               int snd = l-k;
               temp = head;
               int c=0;
               while(temp != null) 
               {
                 if(c+1 == k)
                    break;
                 temp =temp.next;
                c++;
               }
                ListNode temp2 = head;
                c = 0;
                while(temp2 != null)
                {
                    if(c == snd)
                    {
                        int s = temp.val;
                        temp.val = temp2.val;
                        temp2.val = s;
                    return head;
                    }
c++;
                    temp2 = temp2.next;
                }
    return null;
    }
}