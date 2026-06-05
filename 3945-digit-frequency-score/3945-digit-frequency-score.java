class Solution {
    public int digitFrequencyScore(int n) {
        int freq = 0;
        while(n != 0) {
            freq += n % 10;
            n = n / 10;
        }
        return freq;
    }
}