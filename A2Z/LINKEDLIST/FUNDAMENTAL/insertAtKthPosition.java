class Solution {
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {

        if (K == 1) {
            ListNode node = new ListNode(X);
            node.next = head;
            return node;
        }

        ListNode curr = head;

        int count = 1;
        while (curr != null && count < K - 1) {
            curr = curr.next;
            count++;
        }

        if (curr == null) {
            return head;
        }

        ListNode node = new ListNode(X);
        node.next = curr.next;
        curr.next = node;

        return head;
    }
}