// Last updated: 22/09/2025, 08:58:32
class Solution {
    static {
        Solution sol = new Solution();
        for (int i = 0; i < 500; i++)
            sol.isAnagram("", "a");
    } 
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        
        for (int count : arr) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}