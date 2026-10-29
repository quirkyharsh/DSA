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
    public ListNode deleteTail(ListNode head) {
        //your code goes here

        ListNode curr = head;
        ListNode prev = curr;

        if (head == null || head.next == null) {
            return null;
        }

        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;

        return head;
    }
}