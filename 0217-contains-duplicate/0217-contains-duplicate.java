class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> allValues = new HashSet<Integer>();
        for (int num : nums) {
            if (allValues.contains(num)) {
                return true;                
            }
            allValues.add(num);
        }
        return false;
    }
}