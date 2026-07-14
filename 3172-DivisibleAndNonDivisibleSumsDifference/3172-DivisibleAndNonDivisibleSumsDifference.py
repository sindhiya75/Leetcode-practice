# Last updated: 14/07/2026, 14:13:42
class Solution(object):
    def differenceOfSums(self, n, m):
        sum1=0
        sum2=0
        for i in range(1,n+1):
            if i%m==0:
                sum1+=i
            else:
                sum2+=i
        return sum2-sum1
        
        