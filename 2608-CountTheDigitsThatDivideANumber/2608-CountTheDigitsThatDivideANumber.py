# Last updated: 14/07/2026, 14:13:52
class Solution(object):
    def countDigits(self, num):
        n=num
        count=0
        while n!=0:
            d=n%10
            if num%d==0:
                count+=1
            n//=10
        return count
        