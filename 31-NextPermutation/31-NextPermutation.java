// Last updated: 14/07/2026, 14:15:44
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    static void swap(int nums[],int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void reverse(int nums[],int start){
        int e=nums.length-1;
        while(start<e){
            swap(nums,start,e);
            start++;
            e--;
        }
    }
}