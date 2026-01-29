'''
class node:
    def __init__(data):
        self.data = data
        self.next = None
'''

class Solution:
    def getMiddle(self, head):
        if not head:
            return None

        # Step 1: Find length
        length = 0
        temp = head
        while temp:
            length += 1
            temp = temp.next

        # Step 2: Move to middle
        mid = head
        for _ in range(length // 2):
            mid = mid.next

        return mid.data

        
