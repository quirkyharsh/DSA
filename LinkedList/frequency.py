"""  
class Node:
    def __init__(self, data):
		self.data = data
		self.next = None
  This is method only submission.
  You only need to complete the method.
"""
class Solution:
    def count(self, head, key):
        # Code here
        count = 0
        temp = head
        
        while(temp):
            if(temp.data == key):
                count += 1
            
            temp = temp.next
        return count