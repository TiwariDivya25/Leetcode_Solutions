class Solution {
    public int maximumProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > largest) {
                third = second;
                second = largest;
                largest = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num < smallest) {
                secSmallest = smallest;
                smallest = num;
            } else if (num < secSmallest) {
                secSmallest = num;
            }
        }
        return Math.max(largest * second * third, largest * smallest * secSmallest);
    }
}