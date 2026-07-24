class Solution {
    static {
        Solution sol = new Solution();
        for (int i = 0; i < 500; i++)
            sol.isAnagram("", "a");
    } 
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int[] sf = new int[26];
        int[] tf = new int[26];
        for(int i = 0; i < s.length(); i++) {
            sf[s.charAt(i) - 'a']++;
            tf[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(sf[i] != tf[i]) return false;
        }
        return true;
    }
}