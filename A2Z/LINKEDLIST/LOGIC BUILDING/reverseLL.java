/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */


class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode curr = head;
        List<Integer> arr = new ArrayList<>();

       
        while (curr != null) {
            arr.add(curr.val); 
            curr = curr.next; 
        }


        ListNode dummyHead = new ListNode(0); 
        ListNode temp = dummyHead;

        for (int i = arr.size() - 1; i >= 0; i--) { 
            temp.next = new ListNode(arr.get(i));
            temp = temp.next;
        }

        return dummyHead.next;
    }
}