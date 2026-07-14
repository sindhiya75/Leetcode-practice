// Last updated: 14/07/2026, 14:15:31
class Solution {
    public int lengthOfLastWord(String s) {
        String a = s.trim();
        int length = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if(a.charAt(i)==' '){
                break;
            }
            length++;
        }
        return length;
    }
}