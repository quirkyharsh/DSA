class Solution:
    def printList(self, head):
        temp = head
        arr = []
        while temp:
            arr.append(temp.data)
            temp = temp.next
        
        return arr
