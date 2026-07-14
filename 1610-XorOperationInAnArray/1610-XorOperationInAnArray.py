# Last updated: 14/07/2026, 14:14:07
class Solution(object):
    def xorOperation(self, n, start):
        ans=0
        for i in range(n):
            ans^=start+2*i
        return ans
        