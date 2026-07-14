# Last updated: 14/07/2026, 14:14:09
class Solution(object):
    def subtractProductAndSum(self, n):
        prod=1
        digit_sum=0
        while n!=0:
            prod*=n%10
            digit_sum+=n%10
            n//=10
        return prod-digit_sum
        