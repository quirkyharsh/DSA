/* Structure of a Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        Node currNode1 = head1;
        Node currNode2 = head2;
        
        while(currNode1 != null && currNode2 != null){
            if(currNode1.data != currNode2.data){
                return false;
            }
            currNode1 = currNode1.next;
            currNode2 = currNode2.next;
        }
        
        return currNode1 == null && currNode2 == null;
    }
}