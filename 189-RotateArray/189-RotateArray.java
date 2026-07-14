// Last updated: 14/07/2026, 14:14:49
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int temp[]=new int[n];
        int i=0;
        while(i<n){
            int nindex=(i+k)%n;
            temp[nindex]=nums[i];
            i++;
        }
        int j=0;
        while(j<n){
            nums[j]=temp[j];
            j++;
        }
        
    }
}