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
    public void deleteGivenNode(ListNode node) {
        // Your code goes here

        // if node is head
        if(node.prev == null){
            ListNode curr = node;
            curr = curr.next;
            node.next = null;
            curr.prev = null;

        }

        //if node is tail
        if(node.next == null){
            ListNode curr = node;
            curr = node.prev;

            curr.next = null;
            node.prev = null;
        }

        //if node in middle
        if(node.prev != null && node.next != null){
            node.prev.next = node.next;
            node.next.prev = node.prev;

            node.next = null;
            node.prev = null;
        }


    }
}