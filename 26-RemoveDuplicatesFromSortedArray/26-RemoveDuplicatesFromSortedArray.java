// Last updated: 22/09/2025, 08:58:45
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            //if(nums[i] == )
            if(nums[i] != nums[k-1]){
                nums[k]=nums[i];
                k=k+1;
            }

        }
        return k;
    }
}