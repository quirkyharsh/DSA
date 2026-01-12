"""Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order."""

class Solution:
    def areAnagrams(self, s1, s2):
        if len(s1) != len(s2):
            return False

        count = [0] * 26

        for ch in s1:
            count[ord(ch) - ord('a')] += 1

        for ch in s2:
            count[ord(ch) - ord('a')] -= 1

        return all(x == 0 for x in count)
