class Solution:
    def toLower (self , s : str)-> str :
        #code here 
        result = ""
        for char in s:
            if ord(char) > 64 and ord(char) < 91:
                result += chr(ord(char) + 32)
            else:
                result += char
        
        return result