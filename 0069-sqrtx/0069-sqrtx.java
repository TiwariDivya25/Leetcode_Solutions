class Solution {
    public int mySqrt(int x) {
        for(int i = 0; i <= x; i++) {
            if((i+1) > x / (i+1)) return i;
        }
        return 0;
    }
}