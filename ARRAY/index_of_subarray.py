"""
Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

Note: If no such array is possible then, return [-1].
"""

class Solution:
    def subarraySum(self, arr, target):
        n = len(arr) 
        for i in range(n): 
            curr_sum = 0 
            for j in range(i, n):
                curr_sum += arr[j] 
                if curr_sum == target: 
                    return i+1, j+1 