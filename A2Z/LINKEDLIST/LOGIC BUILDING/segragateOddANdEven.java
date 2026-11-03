
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        ArrayList<Integer> arr = new ArrayList<>();

        while (curr != null) {
            arr.add(curr.data);
            curr = curr.next;
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Odd positions (indices 0, 2, 4...)
        for (int i = 0; i < arr.size(); i += 2) {
            result.add(arr.get(i));
        }

        // Even positions (indices 1, 3, 5...)
        for (int i = 1; i < arr.size(); i += 2) {
            result.add(arr.get(i));
        }

        curr = head;

        for (int i = 0; i < result.size(); i++) {
            curr.data = result.get(i);
            curr = curr.next;
        }

        return head;
    }
}
