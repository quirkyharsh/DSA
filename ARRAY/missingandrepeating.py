"""Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number."""


class Solution:
    def findTwoElement(self, arr, n):
        sum_n = n * (n + 1) // 2
        sum_sq_n = n * (n + 1) * (2 * n + 1) // 6

        arr_sum = sum(arr)
        arr_sq_sum = sum(x * x for x in arr)

        diff = arr_sum - sum_n          # X - Y
        sq_diff = arr_sq_sum - sum_sq_n # X² - Y²

        sum_xy = sq_diff // diff        # X + Y

        X = (diff + sum_xy) // 2        # repeating
        Y = X - diff                   # missing

        return X, Y
