# Last updated: 14/07/2026, 14:13:35
class Solution(object):
    def concatWithReverse(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        l=[]
        for i in nums:
            l.append(i)
        l.extend(nums[::-1])
        return l

        