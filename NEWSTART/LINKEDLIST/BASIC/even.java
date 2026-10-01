/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public boolean isEven(Node head) {
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
        }

        // If fast is null, length is even; if fast.next is null, length is odd
        return fast == null;
    }
}