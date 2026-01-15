class Solution:
    def firstRepeated(self,arr):
        # code here 
        seen = set()
        result = 0
        
        for i in range(len(arr)):
            if arr[i] in seen:
                result += 1
            seen.add(arr[i])
            
        if result == 0:
            return -1
        else:
            return result