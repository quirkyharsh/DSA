
# Node Class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Solution:
    def arrayToList(self, arr):
        # code here
        dummy = Node(0)
        curr = dummy
        
        for num in arr:
            curr.next = Node(num)
            curr = curr.next
            
        return dummy.next
        
