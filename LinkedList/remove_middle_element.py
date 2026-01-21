# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return None
        
        length = 0
        temp = head
        while temp:
            length += 1
            temp = temp.next
        
        middle_index = length // 2
        
        temp = head
        for i in range(middle_index - 1):
            temp = temp.next
        

        temp.next = temp.next.next
        
        return head
