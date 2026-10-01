/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        Node currNode = head;
        int length = 0;
        
        while(currNode != null){
            length += 1;
            currNode = currNode.next;
        }
        
        return length;
    }
}