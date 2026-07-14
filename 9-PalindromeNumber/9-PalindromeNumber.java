// Last updated: 14/07/2026, 14:16:00
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||x%10==0 && x!=0){
            return false;
        }
        int org=x;
        int rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        return rev==org;

    }
}