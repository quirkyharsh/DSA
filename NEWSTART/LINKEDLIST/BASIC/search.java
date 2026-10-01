/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node currNode = head;
        
        while(currNode != null){
            if(currNode.data == key){
                return true;
            }
            currNode = currNode.next;
        }
        
        return false;
    }
}