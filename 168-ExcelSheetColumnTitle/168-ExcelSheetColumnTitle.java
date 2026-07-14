// Last updated: 14/07/2026, 14:14:55
class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        String result="";
        while(n>0){
            n--;
            int rem=n%26;
            char ch=(char)('A'+rem);
            result=ch+result;
            n=n/26;            
        }
        return result;
    }
}