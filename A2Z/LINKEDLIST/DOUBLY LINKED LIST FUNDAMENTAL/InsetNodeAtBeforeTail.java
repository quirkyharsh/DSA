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

class InsetNodeAtBeforeTail {
    public ListNode insertBeforeTail(ListNode head, int X) {
        // Your code goes here
        ListNode curr = head;
        ListNode newNode = new ListNode(X);

        if(head == null){
            head = newNode;

        }else if(head.next == null){
            newNode.next = head;
            head.prev = newNode;

            head = newNode;
        } else {
            while (curr.next != null) {
                curr = curr.next; 
            }
            
            ListNode prevNode = curr.prev;
            
            prevNode.next = newNode;
            newNode.prev = prevNode;
            
            newNode.next = curr;
            curr.prev = newNode;
}       

        return head;
    }
}
