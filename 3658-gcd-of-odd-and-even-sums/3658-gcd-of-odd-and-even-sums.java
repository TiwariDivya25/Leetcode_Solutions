class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0;
        int even = 0;
        for(int i = 1; i <= n*2; i+=2) {
            odd += i;
        }
        for(int i = 2; i <= n*2; i+=2) {
            even += i;
        }
        return gcd(odd, even);
    }
    public int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}