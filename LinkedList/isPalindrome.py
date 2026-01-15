'''
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

'''

class Solution:
    def isPalindrome(self, head):
        arr = []
        temp = head

        while temp:
            arr.append(temp.data)
            temp = temp.next

        return arr == arr[::-1]

        
            
        
        
        