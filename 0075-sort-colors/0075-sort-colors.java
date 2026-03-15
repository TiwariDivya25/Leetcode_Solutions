class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int m = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[m] == 0) {
                int temp = nums[s];
                nums[s] = nums[m];
                nums[m] = temp; 
                s++;
                m++;
            }
            else if(nums[m] == 2){
                int temp = nums[e];
                nums[e] = nums[m];
                nums[m] = temp; 
                e--;
            }
            else{
                m++;
            }
        }
    }
}