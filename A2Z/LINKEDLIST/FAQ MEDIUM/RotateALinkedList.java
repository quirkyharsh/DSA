class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Base cases: if list is empty, has only 1 node, or k is 0
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        // Step 1: Find the length of the list and get the tail node
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        
        // Step 2: Optimize k if it's greater than or equal to the length
        k = k % len;
        if (k == 0) {
            return head;
        }
        
        // Step 3: Make the linked list circular by connecting tail to head
        tail.next = head;
        
        // Step 4: Find the new tail, which is at the (len - k)th node
        ListNode newTail = head;
        for (int i = 1; i < len - k; i++) {
            newTail = newTail.next;
        }
        
        // Step 5: Set the new head and break the circular connection
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}