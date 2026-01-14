class Solution:
    def rotate(self, arr):
        if len(arr) <= 1:
            return arr

        last = arr.pop()      # removes last element safely
        arr.insert(0, last)

        return arr
