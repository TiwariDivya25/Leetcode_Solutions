class Solution {
    public int maxProduct(int[] nums) {
        int lar = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > lar) {
                seclar = lar;
                lar = num;
            } else if (num > seclar) {
                seclar = num;
            }
        }
        return (lar-1) * (seclar-1);
    }
}