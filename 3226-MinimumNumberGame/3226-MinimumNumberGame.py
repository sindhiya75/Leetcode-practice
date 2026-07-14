# Last updated: 14/07/2026, 14:13:34
class Solution(object):
    def numberGame(self, nums):
        n=nums.sort()
        for i in range(0,len(nums),2):
            nums[i],nums[i+1]=nums[i+1],nums[i]

        return nums