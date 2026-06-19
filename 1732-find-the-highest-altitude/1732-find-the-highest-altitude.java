class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int ans = 0;
        for(int g : gain) {
            alt = alt + g;
            ans = Math.max(ans, alt);
        }
        return ans;
    }
}