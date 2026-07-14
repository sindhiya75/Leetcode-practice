// Last updated: 14/07/2026, 14:14:01
class Solution {
    public String reversePrefix(String word, char ch) {
            int str=word.indexOf(ch);
            if(str==-1){
                return word;
            }
            char n[]=word.toCharArray();
            int l=0;
            int r=str;
            while(l<r){
                char temp=n[l];
                n[l]=n[r];
                n[r] = temp;
                l++;
                r--;
            }
            return new String(n);
    }
}