"""
Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

Note: You can return the elements in any order but the driver code will print them in sorted order.
 
"""

class Solution:
    def findDuplicates(self, arr):
        # code here
        arr.sort()
        result = []
        
        for i in range(1, len(arr)):
            if arr[i] ==arr[i-1]:
                result.append(arr[i])
                
        return result
        