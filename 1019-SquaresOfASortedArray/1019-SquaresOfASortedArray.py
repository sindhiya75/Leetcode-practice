# Last updated: 14/07/2026, 14:14:11
class Solution(object):
    def sortedSquares(self, nums):
        s=[]
        for i in nums:
            s.append(i*i)
        s.sort()
        return s