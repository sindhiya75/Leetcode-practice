// Last updated: 14/07/2026, 14:15:45
class Solution {
    public int strStr(String haystack, String needle) {
        int index=0;
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }
        return -1;

    
        
    }
}