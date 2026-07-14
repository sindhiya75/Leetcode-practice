# Last updated: 14/07/2026, 14:14:18
class Solution(object):
    def countSubstrings(self, s):
        c=0
        for i in range(len(s)):
            for j in range(i+1,len(s)+1):
                sub=s[i:j]
                if sub==sub[::-1]:
                    c+=1
        return c
        