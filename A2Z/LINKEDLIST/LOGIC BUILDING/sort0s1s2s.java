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
    public ListNode sortList(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();

        ListNode curr = head;
        while (curr != null) {
            map.put(curr.data, map.getOrDefault(curr.data, 0) + 1);
            curr = curr.next;
        }

        int zeroCount = map.getOrDefault(0, 0);
        int oneCount  = map.getOrDefault(1, 0);
        int twoCount  = map.getOrDefault(2, 0);


        ListNode temp = head;

            for(int i = 0; i < zeroCount; i++){
                temp.data = 0;
                temp = temp.next;
            }

            for(int i = 0; i < oneCount; i++){
                temp.data = 1;
                temp = temp.next;
            }

            for(int i = 0; i < twoCount; i++){
                temp.data = 2;
                temp = temp.next;
            }
        

        return head;
    }
}