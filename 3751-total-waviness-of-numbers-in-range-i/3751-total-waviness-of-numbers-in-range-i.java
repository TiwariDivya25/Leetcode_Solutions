class Solution {
    public int totalWaviness(int num1, int num2) {
        int w = 0;

        for (int i = num1; i <= num2; i++) {
            w += wave(Integer.toString(i));
        }

        return w;
    }

    private int wave(String num) {
        if (num.length() <= 2) return 0;

        int w = 0;

        for (int i = 1; i < num.length() - 1; i++) {
            if (num.charAt(i - 1) - '0' < num.charAt(i) - '0' &&
                num.charAt(i + 1) - '0' < num.charAt(i) - '0') {
                w++;
            }

            if (num.charAt(i - 1) - '0' > num.charAt(i) - '0' &&
                num.charAt(i + 1) - '0' > num.charAt(i) - '0') {
                w++;
            }
        }

        return w;
    }
}