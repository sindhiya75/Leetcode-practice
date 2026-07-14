// Last updated: 14/07/2026, 14:14:44
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 &&(n&(n-1))==0;
    }
}