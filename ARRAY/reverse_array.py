"""
Docstring for DSA.ARRAY.reverse_array
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.
"""

#User function Template for python3

class Solution:
    #Function to rotate an array by d elements in counter-clockwise direction. 
    def rotateArr(self, arr, d):
        #Your code here
        for i in range(d):
            first_element = arr[0]
            arr.remove(first_element)
            arr.append(first_element)
            
        return arr