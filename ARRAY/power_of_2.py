#Given a non-negative integer n. You have to check if it is a power of 2 or not. 

class Solution:
    def isPowerofTwo(self, n):
        # code here
        if(n == 0):
            return False
        
        if(n == 1):
            return True
            
        while(n%2 == 0):
            n //=2
            
        return n == 1