class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] t = new int[text1.length()][text2.length()];
        for(int i = 0; i < text1.length(); i++) {
            for(int j = 0; j < text2.length(); j++) {
                t[i][j] = -1;
            }
        }
        return lcs(text1, text2, text1.length()-1, text2.length()-1, t);
    }
    public int lcs(String text1, String text2, int m, int n, int[][] t) {
        if(m < 0 || n < 0) return 0;
        if(t[m][n] != -1) return t[m][n];
        if(text1.charAt(m) == text2.charAt(n)) {
            return t[m][n] = 1 + lcs(text1, text2, m-1, n-1, t);
        }
        return t[m][n] = Math.max(lcs(text1, text2, m-1, n, t), lcs(text1, text2, m, n-1, t));
    }
}