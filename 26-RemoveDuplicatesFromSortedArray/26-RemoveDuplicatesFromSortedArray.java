// Last updated: 14/07/2026, 14:15:48
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                    nums[k]=nums[i];
                    k++;
                }
        }
        return k;
    }
}