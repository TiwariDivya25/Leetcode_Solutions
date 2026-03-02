class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] req = new int[26];
        List<String> ans = new ArrayList<>();
        for(String w : words2) {
            int[] freq = new int[26];
            for(char c : w.toCharArray()){
                freq[c-'a']++;
            }
            for(int i = 0; i < 26; i++) {
                req[i] = Math.max(req[i], freq[i]);
            } 
        }
        for(int i = 0; i < words1.length; i ++) {
            if(check(words1[i], req)){
                ans.add(words1[i]);
            }
        }
        return ans;
    }
    public boolean check(String word, int[] req) {
        int[] temp = new int[26];
        for(char w : word.toCharArray()) {
            temp[w - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(temp[i] < req[i]) {
                return false;
            }
        }
        return true;
    }
}