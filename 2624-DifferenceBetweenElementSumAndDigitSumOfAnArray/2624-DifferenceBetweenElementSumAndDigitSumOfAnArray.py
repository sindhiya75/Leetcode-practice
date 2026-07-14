# Last updated: 14/07/2026, 14:13:51
class Solution(object):
    def differenceOfSum(self, nums):
        sum=0
        digit_sum=0
        for num in nums:
            sum+=num
            n=num
            while n!=0:
                digit_sum+=n%10
                n//=10
        return abs(sum-digit_sum)

        



