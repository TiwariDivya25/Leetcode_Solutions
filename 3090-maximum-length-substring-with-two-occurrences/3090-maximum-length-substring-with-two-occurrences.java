class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = 0;
        for(int i = 0; i < s.length()-1; i++) {
            int[] c = new int[26];
            c[s.charAt(i) - 'a']++; 
            int size = 1;
            for(int j = i+1; j < s.length(); j++) {
                c[s.charAt(j) - 'a']++;
                int cnt = c[s.charAt(j) - 'a'];
                if(cnt == 3) break;
                size += 1;
            }
            ans = Math.max(ans, size);
        }
        return ans;
    }
}