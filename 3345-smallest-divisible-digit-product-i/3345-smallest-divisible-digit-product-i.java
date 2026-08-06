class Solution {
    public int smallestNumber(int n, int t) {
        while(digP(n) % t != 0) {
            n+=1;
        }
        return n;
    }
    private long digP(int n) {
        long ans = 1;
        while(n > 0) {
            ans *= n % 10;
            n /= 10;
        }
        return ans;
    }
}