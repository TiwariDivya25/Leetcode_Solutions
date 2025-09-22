// Last updated: 22/09/2025, 08:58:40
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0; 
        }

        HashSet<Integer> vals = new HashSet<>();
        for(int num : nums) {
            vals.add(num);
        }

        int longestSub = 1;

        for(int num : vals) {
            if(vals.contains(num-1)) {
                continue;
            }
            else { 
                int current = num;
                int sub = 1;
                while(vals.contains(current+1)) {
                    current++;
                    sub++;
                }

                longestSub = Math.max(longestSub, sub);
            }
        }
        return longestSub;
    }
}