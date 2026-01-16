class Solution:
    def findDuplicates(self, nums):
        seen = set()
        result = []
        for i in range(len(nums)):
            if nums[i] in seen:
                result.append(nums[i])
            else:
                seen.add(nums[i])

        return result