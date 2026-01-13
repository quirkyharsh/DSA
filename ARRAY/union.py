"""You are given two arrays a[] and b[], return the Union of both the arrays in any order.

The Union of two arrays is a collection of all distinct elements present in either of the arrays. If an element appears more than once in one or both arrays, it should be included only once in the result.

Note: Elements of a[] and b[] are not necessarily distinct.
Note that, You can return the Union in any order but the driver code will print the result in sorted order only."""

class Solution:    
    def findUnion(self, a, b):
        # code here
        result = []
        
        for x in a:
            if x not in result:
                result.append(x)
                
        for y in b:
            if y not in result:
                result.append(y)
                
        return result