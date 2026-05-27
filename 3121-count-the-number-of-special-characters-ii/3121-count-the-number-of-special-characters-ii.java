class Solution {
    public int numberOfSpecialChars(String word) {
        int[] l = new int[26];
        int[] u = new int[26];
        Arrays.fill(l, -1);
        Arrays.fill(u, -1);
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(Character.isLowerCase(c)) {
                l[c-'a'] = i;
            }
            else {
                if(u[c-'A'] == -1) {
                    u[c-'A'] = i;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(l[i] != -1 && u[i] != -1 && l[i] < u[i]) count++;
        }
        return count;
    }
}