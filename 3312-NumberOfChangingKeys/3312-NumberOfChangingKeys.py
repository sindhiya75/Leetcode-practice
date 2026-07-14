# Last updated: 14/07/2026, 14:13:39
class Solution(object):
    def countKeyChanges(self, s):
        count=0
        for i in range(1,len(s)):
            if s[i].lower()!=s[i-1].lower():
                count+=1
        return count