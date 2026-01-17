class Solution:
    def nonRepeatingChar(self,s):
        #code here
        freq = {}
        # Step 1: Count frequency of each character
        for ch in s:
            freq[ch] = freq.get(ch, 0) + 1
    
        # Step 2: Find first character with frequency 1
        for ch in s:
            if freq[ch] == 1:
                return ch
    
        return '$'
        
    
    