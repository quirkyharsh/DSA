'''
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''

class Solution:
    def rotate(self, head, k):
        if not head or not head.next or k == 0:
            return head

        for _ in range(k):
            temp = head
            head = temp.next
            temp.next = None
            
            curr_node = head
            while(curr_node.next):
                curr_node = curr_node.next
                
            curr_node.next = temp
            
        return head