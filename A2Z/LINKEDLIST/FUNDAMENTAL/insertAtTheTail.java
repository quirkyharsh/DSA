public class insertAtTheTail {
    
}
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
    public ListNode insertAtTail(ListNode head, int X) {
        //YOUR CODE GOES HERE
        if(head == null){
            head = new ListNode(X);
            return head;
        }

        ListNode curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = new ListNode(X);

        return head;
    }
}