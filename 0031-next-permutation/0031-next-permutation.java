class Solution {

    public void reverse(int[] arr, int start) {
        int left = start, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(nums, 0);
            return;
        }

        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        reverse(nums, idx + 1);
    }
}
