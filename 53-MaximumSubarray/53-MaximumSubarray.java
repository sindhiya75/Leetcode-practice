// Last updated: 14/07/2026, 14:15:34
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum =nums[0];
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum = Math.max(nums[i] , currSum + nums[i]);
            maxsum = Math.max(currSum , maxsum);
        }
        return maxsum;
    }
}