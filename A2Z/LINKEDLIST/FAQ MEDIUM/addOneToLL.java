class Solution {
    public ListNode addOne(ListNode head) {
        ListNode curr = head;
        int num = 0;

        while(curr != null){
            num = num * 10 + curr.val;
            curr = curr.next;
        }

        num = num + 1;

        ListNode cur = head;
        ListNode prev = null;

        while(cur != null){
            
            cur.val = num % 10;
            num = num / 10;

            prev = cur;
            cur = cur.next;
        }

        if(num > 0){
            ListNode LastNode = new ListNode(num);
            LastNode.next = head;
            head = LastNode;
        }

        return head;
    }
}