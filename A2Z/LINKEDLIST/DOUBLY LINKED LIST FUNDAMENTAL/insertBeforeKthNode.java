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
    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        // Your code goes here
        ListNode newNode = new ListNode(X);
        ListNode curr = head;

        if(K == 1){
            newNode.next = head;
            head.prev = newNode;

            head = newNode;
        }else{
            for(int i = 0;i < K - 1; i++){
            curr = curr.next;
            }

            newNode.next = curr;
            newNode.prev = curr.prev;
            curr.prev.next = newNode;
            curr.prev = newNode;
            
        }
        return head;

    }
}