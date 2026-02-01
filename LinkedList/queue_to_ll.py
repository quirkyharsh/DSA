class Node:
    def __init__(self, new_data):
        self.data = new_data
        self.next = None 


class Solution:
    def sortedInsert(self, head, key):
        # code here
        # return head of edited linked list
        new_node = Node(key)
        
        if head is None or key < head.data:
            new_node.next = head
            return new_node
            
        temp = head
        while temp.next and temp.next.data < key:
            temp = temp.next

        # Insert node
        new_node.next = temp.next
        temp.next = new_node

        return head
        