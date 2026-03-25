class Solution {
    public int minOperations(String s) {
        int s0 = 0, s1 = 0; //s0- 0101010, s1- 101010
        for(int i = 0; i < s.length(); i++) {
            if(i%2 == 0) {
                if(s.charAt(i) == '1') s0++;
                if(s.charAt(i) == '0') s1++;
            }
            else {
                if(s.charAt(i) == '0') s0++;
                if(s.charAt(i) == '1') s1++;
            }
        }
        return Math.min(s0, s1);
    }
}