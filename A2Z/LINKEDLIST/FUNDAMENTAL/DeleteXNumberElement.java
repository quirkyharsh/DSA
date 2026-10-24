/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode deleteKthNode(ListNode head, int k) {
        // Your code goes here
        if (head == null) return null;

        if (k == 1) {
            ListNode temp = head;
            head = head.next;
            temp.next = null; 
            return head;
        }
        ListNode curr = head;
        
        for (int i = 1; i < k - 1; i++) {
            if (curr != null) {
                curr = curr.next;         //prev
            }
        }

        if (curr != null && curr.next != null) {
            ListNode nodeToDelete = curr.next;
            curr.next = nodeToDelete.next;
            nodeToDelete.next = null; 
        }

        return head;

    }
}