/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode deleteTail(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode current = head;

        while (current.next != null) {
            current = current.next;
        }
        
        current.prev.next = null;
        current.prev = null;
        
        return head;
    }
}