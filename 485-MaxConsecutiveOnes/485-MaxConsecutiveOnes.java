// Last updated: 14/07/2026, 14:14:20
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                 count=0;
            }
           
        }
          return max;
     
    }
}