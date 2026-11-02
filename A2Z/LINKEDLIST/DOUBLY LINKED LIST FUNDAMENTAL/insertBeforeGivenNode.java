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
    public void insertBeforeGivenNode(ListNode node, int X) {
        ListNode prevNode = node.prev;
        ListNode newNode = new ListNode(X, prevNode, node);
        
        if (prevNode != null) {
            prevNode.next = newNode;
        }
        node.prev = newNode;
    }
}