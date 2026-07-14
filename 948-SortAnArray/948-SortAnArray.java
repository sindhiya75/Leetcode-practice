// Last updated: 14/07/2026, 14:14:12
class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=1; i<n;i++){
            int s=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>s){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=s;
        }
        return nums;
    }
}