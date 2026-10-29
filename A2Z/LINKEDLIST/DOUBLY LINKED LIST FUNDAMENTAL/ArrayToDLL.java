class Solution {
    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return null;
        }

        ListNode head = new ListNode(arr.get(0));
        ListNode current = head;

        for (int i = 1; i < arr.size(); i++) {
            ListNode newNode = new ListNode(arr.get(i));
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }

        return head;
    }
}