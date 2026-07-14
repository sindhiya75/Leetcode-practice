# Last updated: 14/07/2026, 14:14:04
class Solution(object):
    def maximumWealth(self, accounts):
        maxs=0
        for i in accounts:
            w=sum(i)
            maxs=max(w,maxs)
        return maxs
        