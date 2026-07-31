class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char c : word.toCharArray()) {
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int ans = 0;
        int push = 1;
        for(int i = 25; i >= 0; i--) {
            if((25 - i) % 8 == 0 && i != 25) {
                push++;
            }
            ans += push * freq[i];
        }
        return ans;
    }
}