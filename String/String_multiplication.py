class Solution:
    def convert_String_to_int(self, s):
        negative = False
        
        # Check for negative sign
        if s[0] == '-':
            negative = True
            s = s[1:]   # remove '-' safely
        
        num = 0
        for char in s:
            num = num * 10 + (ord(char) - 48)
            
        if negative:
            return -num
        else:
            return num

    def multiplyStrings(self, s1, s2):
        num1 = self.convert_String_to_int(s1)
        num2 = self.convert_String_to_int(s2)
        return num1 * num2
