// Last updated: 22/09/2025, 08:58:49
class Solution {
    public int reverse(int x) {
        int reversed_x = 0;

        while (x != 0) {
            int digit = x % 10;
            
            // Check for positive overflow
            if (reversed_x > Integer.MAX_VALUE / 10) {
                return 0;
            }

            // Check for negative overflow
            if (reversed_x < Integer.MIN_VALUE / 10 ) {
                return 0;
            }

            reversed_x = reversed_x * 10 + digit;
            x /= 10;
        }

        return reversed_x;
    }
}