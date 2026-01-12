"""A operation on a circular array shifts each of the array's elements unit to the left. The elements that fall off the left end reappear at the right end. Given an integer , rotate the array that many steps to the left and return the result. Example After rotations, . Function Description Complete the function with the following parameters: : the amount to rotate by : the array to rotate Returns : the rotated array Input Format The first line contains two space-separated integers that denote , the number of integers, and , the number of left rotations to perform. The second line contains space-separated integers that describe . #!/bin/python3 import math import os import random import re import sys # # Complete the 'rotateLeft' function below. # # The function is expected to return an INTEGER_ARRAY. # The function accepts following parameters: # 1. INTEGER d # 2. INTEGER_ARRAY arr """

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'rotateLeft' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER d
#  2. INTEGER_ARRAY arr
#

def rotateLeft(d, arr):
    # Write your code here
    for i in range(d):
        first_element = arr[0]
        arr.remove(arr[0])
        arr.append(first_element)
        
    return arr 
    
    
    
    
    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    d = int(first_multiple_input[1])

    arr = list(map(int, input().rstrip().split()))

    result = rotateLeft(d, arr)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
