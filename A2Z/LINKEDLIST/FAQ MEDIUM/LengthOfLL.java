
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


class Solution {
    public int findLengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode start = null;
        int length = 0;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }

                start = slow;

                ListNode temp = start;
                do {
                    length++;
                    temp = temp.next;
                } while(temp != start);

                return length;
            }
        }

        return 0;
    }
}
