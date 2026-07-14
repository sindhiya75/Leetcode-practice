# Last updated: 14/07/2026, 14:14:02
class Solution(object):
    def checkIfPangram(self, sentence):
        s=sentence.lower()
        for ch in 'abcdefghijklmnopqrstuvwxyz':
            if ch not in s:
                return False
        return True