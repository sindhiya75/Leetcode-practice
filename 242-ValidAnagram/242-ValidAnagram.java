// Last updated: 14/07/2026, 14:14:47
class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a,b);
    }
}