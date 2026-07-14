// Last updated: 14/07/2026, 14:15:07
class Solution {
    public boolean isPalindrome(String s) {
        String st="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st+=Character.toLowerCase(ch);
            }
        }
        int left=0;
        int right=st.length()-1;
        while(left<right){
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
           return true;
     
    }
}