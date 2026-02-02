
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Solution:
    def isSorted(self, head):
        temp = head
        
        inc = True
        dec = True
        
        while temp and temp.next:
            if temp.data > temp.next.data:
                inc = False
                
            if temp.data < temp.next.data:
                dec = False
                
            temp = temp.next
            
        return inc or dec
