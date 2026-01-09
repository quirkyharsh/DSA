
"""
Docstring for DSA.ARRAY.evenly_divisible
Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.
"""



class Solution:
    def rotateArr(self, arr, d):
        n = len(arr)
        d = d % n   # important

        arr[:] = arr[d:] + arr[:d]
        return arr
