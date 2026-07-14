# Last updated: 14/07/2026, 14:14:58
class Solution(object):
    def findMin(self, nums):
        left,right=0 , len(nums)-1
        while left < right:
            mid=(left+right)//2
            if nums[mid]> nums[right]:
                left=mid+1
            elif nums[mid]<nums[right]:
                right=mid
            else:
                right-=1
        return nums[left]
        