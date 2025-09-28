class Solution {
    static{
        Solution sol = new Solution();
        for(int i = 0; i < 150; i++) {
            sol.characterReplacement("AB", 1);
        }
    }
    public int characterReplacement(String s, int k) {
        int left = 0, ans = 0, maxOcc = 0;
        int[] occ = new int[26];

        for (int right = 0; right < s.length(); right++) {
            maxOcc = Math.max(maxOcc, ++occ[s.charAt(right)-'A']);
            if(right - left + 1 - maxOcc > k) {
                occ[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
        
    }
}