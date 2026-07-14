# Last updated: 14/07/2026, 14:15:06
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result=0
        for num in nums:
            result^=num

        return result
        