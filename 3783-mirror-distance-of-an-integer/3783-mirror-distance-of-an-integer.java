class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - rev(n));
    }
    private int rev(int n) {
        int num = 0;
        while(n!=0) {
            int r = n % 10;
            num = num * 10 + r;
            n = n / 10;
        }
        return num;
    }
}