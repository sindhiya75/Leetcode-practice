# Last updated: 14/07/2026, 14:13:41
class Solution(object):
    def findWordsContaining(self, words, x):
        a=[]
        for i in range(len(words)):
            if x in words[i]:
                a.append(i)
        return a