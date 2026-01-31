#User function Template for python3

class Solution:
    def countOfElements(self, x, arr):
        # Code Here
        result = 0
        
        for num in arr:
            if(num <= x):
                result += 1

        return result
        