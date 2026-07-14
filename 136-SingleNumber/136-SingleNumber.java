// Last updated: 14/07/2026, 14:15:09
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int n:nums){
            result^=n;
        }
        return result;
    }
}