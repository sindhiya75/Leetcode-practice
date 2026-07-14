# Last updated: 14/07/2026, 14:13:57
class Solution(object):
    def firstPalindrome(self, words):
        for word in words:
            if word==word[::-1]:
                return word
        return ""
        