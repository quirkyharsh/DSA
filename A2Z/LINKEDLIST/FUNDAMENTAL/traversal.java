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
    public List<Integer> LLTraversal(ListNode head) {
        
        List<Integer> result = new ArrayList<>();
        ListNode curr = head;

       
        while (curr != null) {
            result.add(curr.data);
            curr = curr.next;
        }

        return result;
    }
}