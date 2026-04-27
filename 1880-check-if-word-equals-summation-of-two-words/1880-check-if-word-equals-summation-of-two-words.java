class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int f = 0, s = 0, t = 0;
        for(int i = 0; i < firstWord.length(); i++) {
            f = (f*10) + (firstWord.charAt(i)-'a');
        }
        for(int i = 0; i < secondWord.length(); i++) {
            s = (s*10) + (secondWord.charAt(i)-'a');
        }
        for(int i = 0; i < targetWord.length(); i++) {
            t = (t*10) + (targetWord.charAt(i)-'a');
        }
        return (f + s) == t;
    }
}