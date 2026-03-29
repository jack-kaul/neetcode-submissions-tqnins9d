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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1, prevT1 = null;
        ListNode t2 = l2, prevT2 = null;
        boolean t1_contd = false;
        int dSum=0, carry = 0;
        while(t1 != null && t2 != null) {
            dSum = t1.val + t2.val + carry;
            carry = dSum > 9 ? dSum/10 : 0;
            dSum = dSum%10;
            t1.val = dSum;
            t2.val = dSum;
            prevT1 = t1;
            prevT2 = t2;
            t1 = t1.next;
            t2 = t2.next;
            dSum = 0;
        }

        while(t1 != null) {
            dSum = t1.val + carry;
            carry = dSum > 9 ? dSum/10 : 0;
            dSum = dSum%10;
            t1.val = dSum;
            prevT1 = t1;
            t1 = t1.next;
            dSum = 0;
            t1_contd = true;
        }

        while(t2 != null) {
            dSum = t2.val + carry;
            carry = dSum > 9 ? dSum/10 : 0;
            dSum = dSum%10;
            t2.val = dSum;
            prevT2 = t2;
            t2 = t2.next;
            dSum = 0;
        }

        ListNode last = null;
        if(carry != 0) {
            last = new ListNode(carry);
        }

        if(t1_contd) {
            prevT1.next = last;
            return l1;
        } else {
            prevT2.next = last;
            return l2;
        }
    }
}
