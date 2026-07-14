# Last updated: 14/07/2026, 14:13:59
class Solution(object):
    def mostWordsFound(self, sentences):
        maximum=0
        for s in sentences:
            count=len(s.split())
            maximum=max(maximum,count)
        return maximum
        