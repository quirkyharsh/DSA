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
    public ListNode deleteKthElement(ListNode head, int k) {
        // Your code goes here

        int count = 0;

        ListNode curr = head;

        


        // if node is head
        if(k == 1){
            ListNode newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            return newHead;
        }

        while(curr != null && count < k - 1){
            curr = curr.next;
            count++;
        }

        // if node is tail
        if(curr.next == null){
            curr.prev.next = null;
            curr.prev = null;
            return head;
        }

        // node is somewhere between head and tail
        
        

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        curr.next = null;
        curr.prev = null;

        return head;

    }
}