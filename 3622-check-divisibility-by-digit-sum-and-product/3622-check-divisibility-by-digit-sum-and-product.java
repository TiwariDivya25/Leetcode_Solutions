class Solution {
    public boolean checkDivisibility(int n) {
        return n % (sum(n) + prod(n)) == 0;
    }
    public int sum(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public long prod(int n) {
        long prod = 1;
        while(n != 0) {
            prod *= n % 10;
            n /= 10; 
        }
        return prod;
    }
}