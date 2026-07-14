# Last updated: 14/07/2026, 14:16:03
class Solution(object):
    def longestPalindrome(self, s):
        long=""
        for i in range(len(s)):
            for j in range(i+1,len(s)+1):
                sub=s[i:j]
                if sub==sub[::-1] and len(sub)>len(long):
                    long=sub
        return long