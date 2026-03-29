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
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode newHead = head;
        ListNode lead = head.next;
        head.next = null;
        while(lead != null) {
            ListNode intermediate = lead;
            lead = lead.next;
            intermediate.next = newHead;
            newHead = intermediate;
        }
        return newHead;
    }
}