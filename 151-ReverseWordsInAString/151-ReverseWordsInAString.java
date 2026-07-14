// Last updated: 14/07/2026, 14:15:00
class Solution {
    public String reverseWords(String s) {
        String st[]=s.split("\\s+");
        String s2=" ";
        for(int i=st.length-1;i>=0;i--){
            s2=s2+st[i]+" ";
        }
        return s2.trim();
    }
}