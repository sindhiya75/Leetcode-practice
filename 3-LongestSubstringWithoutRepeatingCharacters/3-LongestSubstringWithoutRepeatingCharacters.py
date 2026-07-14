# Last updated: 14/07/2026, 14:16:04
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        s1=[]
        left=0
        max_len=0
        for right in range(len(s)):
            while s[right] in s1:
                s1.remove(s[left])
                left+=1
            s1.append(s[right])
            max_len=max(max_len,right-left + 1)
        return max_len
