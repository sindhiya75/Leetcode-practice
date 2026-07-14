# Last updated: 14/07/2026, 14:14:23
class Solution(object):
    def minMoves(self, nums):
        minimum = min(nums)
        moves = 0

        for num in nums:
            moves += num - minimum

        return moves
        