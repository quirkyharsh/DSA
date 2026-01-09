"""
Docstring for DSA.ARRAY.peak_element
You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).

If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

Note: Consider the element before the first element and the element after the last element to be negative infinity.
"""

class Solution:   
    def peakElement(self, arr):
        # Code here
        n = len(arr)
        for i in range(1, n-1):
            if arr[i] > arr[i-1] and arr[i] > arr[i+1]:
                return i
                
        if arr[n-1] > arr[n-2]:
            return n-1    
        return False