# Last updated: 14/07/2026, 14:14:42
class Solution(object):
    def isAnagram(self, s, t):
        return sorted(s)==sorted(t)
        
            