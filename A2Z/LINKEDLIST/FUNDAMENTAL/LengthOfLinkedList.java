class Solution {
    public int getLength(ListNode head) {
        // Your code goes here
        int length = 0;

        ListNode curr = head;

        while(curr != null){
            length += 1;
            curr = curr.next;
        }

        return length;
    }
}