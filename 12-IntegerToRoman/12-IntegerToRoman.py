# Last updated: 14/07/2026, 14:15:57
class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        values = [1000, 900, 500, 400,
                  100, 90, 50, 40,
                  10, 9, 5, 4, 1]

        symbols = ["M", "CM", "D", "CD",
                   "C", "XC", "L", "XL",
                   "X", "IX", "V", "IV", "I"]
        r=""
        for i in range(len(values)):
            while num>=values[i]:
                r+=symbols[i]
                num-=values[i]
        return(r)