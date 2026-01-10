"""Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.

Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

Examples:

"""
class Solution:
    def majorityElement(self, arr):
        #code here
        if(len(arr) == 1):
            return arr[0]
            
        freq = {}
        
        for num in arr:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1
                
        for key,value in freq.items():
            if value > len(arr)//2:
                return key
        
        return -1
        
        