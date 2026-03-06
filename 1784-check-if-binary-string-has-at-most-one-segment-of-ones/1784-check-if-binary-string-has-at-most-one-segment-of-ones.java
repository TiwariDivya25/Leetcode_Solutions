class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i = 0, j = 1; i < s.length() - 1; i++, j++) {
            if(s.charAt(i) == '0' && s.charAt(j) == '1') return false;
        }
        return true;
    }
}