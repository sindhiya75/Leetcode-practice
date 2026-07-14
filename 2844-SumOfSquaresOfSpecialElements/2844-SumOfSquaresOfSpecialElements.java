// Last updated: 14/07/2026, 14:13:47
class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0; i<n; i++){
            if(n%(i+1)==0){
                res+=nums[i]*nums[i];
            }
        }
        return res;
    }
}