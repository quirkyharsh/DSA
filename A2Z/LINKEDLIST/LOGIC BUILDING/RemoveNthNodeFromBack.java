
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = head;
        int size = 0;

        while (curr != null) {
            curr = curr.next;
            size++;
        }

        int TargetIndex = size + 1 - n; // 1-based index

        if (TargetIndex == 1) { // head
            ListNode temp = head;
            head = temp.next;
            temp.next = null;

        } else if (TargetIndex == size) { // tail
            ListNode temp = head;

            for (int i = 1; i < TargetIndex - 1; i++) {
                temp = temp.next;
            }

            temp.next = null;

        } else { // middle
            ListNode cur = head;

            for (int i = 1; i < TargetIndex - 1; i++) {
                cur = cur.next;
            }

            cur.next = cur.next.next;
        }

        return head;
    }
}
