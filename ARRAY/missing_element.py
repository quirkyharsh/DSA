"""
 You are given an array arr[] of size n - 1 that contains distinct integers in the range
 from 1 to n (inclusive). This array represents a permutation of the integers 
 from 1 to n with one element missing. Your task is to identify and 
 return the missing element.
"""
class Solution:
    def missingNum(self, arr):
        n = len(arr) + 1
        
        expected_summ = n * (n + 1) // 2

        actual_summ = sum(arr)
        

        return expected_summ - actual_summ