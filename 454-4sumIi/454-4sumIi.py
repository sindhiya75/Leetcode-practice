# Last updated: 14/07/2026, 14:14:21
class Solution(object):
    def fourSumCount(self, nums1, nums2, nums3, nums4):
        sum_map={}
        for a in nums1:
            for b in nums2:
                s=a+b
                sum_map[s]=sum_map.get(s,0)+1
        count=0
        for c in nums3:
            for d in nums4:
                t=-(c+d)
                count+=sum_map.get(t,0)
        return count
