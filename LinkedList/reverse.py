
class Node:
    def __init__(self, val):
        self.data = val
        self.next = None



class Solution:
    def reverseList(self, head):
        arr = []
        temp = head

        while temp:
            arr.append(temp.data)
            temp = temp.next

        dummy = Node(0)
        curr = dummy

        for i in range(len(arr) - 1, -1, -1):
            curr.next = Node(arr[i])
            curr = curr.next

        return dummy.next
