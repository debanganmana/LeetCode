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
        // Create a dummy head node to build the result list easily
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop as long as there are nodes to process or a carry remains
        while (l1 != null || l2 != null || carry != 0) {
            // If the list has run out of digits, default its value to 0
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate total sum for the current position
            int total = val1 + val2 + carry;
            
            // Extract the new carry (either 0 or 1)
            carry = total / 10;

            // Create the next node with the single-digit value
            current.next = new ListNode(total % 10);
            
            // Advance the current result pointer
            current = current.next;

            // Advance l1 and l2 pointers if they aren't null
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            
        }

        // The actual head of the result list is next to the dummy head
        return dummyHead.next;
    }
}
