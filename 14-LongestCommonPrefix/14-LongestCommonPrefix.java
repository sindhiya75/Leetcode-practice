// Last updated: 14/07/2026, 14:15:54
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String a=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(a)!=0){
                a=a.substring(0,a.length()-1);
                if(a.isEmpty())
                       return "";
            }
        }
        return a;
        
    }
}