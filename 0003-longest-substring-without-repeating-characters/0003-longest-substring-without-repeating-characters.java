class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }

        int left = 0;
        int right = 0; 
        int maxSub = 0;

        HashSet<Character> hs = new HashSet<>();

        while(right < s.length()) {
            char c = s.charAt(right);
            while(hs.contains(c)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(c);
            maxSub = Math.max(maxSub, right-left+1);
            right++;
        }
        return maxSub;
        
    }
}