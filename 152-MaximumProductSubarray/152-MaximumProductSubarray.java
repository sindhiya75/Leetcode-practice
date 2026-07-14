// Last updated: 14/07/2026, 14:14:59
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxs=nums[0];
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                maxs=Math.max(maxs,prod);
            }
        }
        return  maxs;
    }
}