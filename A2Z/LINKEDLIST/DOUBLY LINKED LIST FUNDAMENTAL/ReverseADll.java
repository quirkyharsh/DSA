/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/

class Solution {
    public ListNode reverseDLL(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode right = head;
        ListNode left = head;
        
        while (right.next != null) {
            right = right.next;
        }
        
        while (left != right && left.next != right) {
            int temp = right.data;
            right.data = left.data;
            left.data = temp;
            
            left = left.next;
            right = right.prev;
        }
        
        if (left == right.prev) {
            int temp = right.data;
            right.data = left.data;
            left.data = temp;
        }
        
        return head;
    }
}