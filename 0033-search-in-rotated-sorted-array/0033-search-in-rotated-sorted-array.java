class Solution {
    public int search(int[] nums, int target) {
        return s(nums, target, 0, nums.length-1);
    }
    public int s(int[] arr, int target, int s, int e) {
        if(s>e) return -1;
        int mid = s+(e-s)/2;
        if(arr[mid] == target) return mid;
        if(arr[s] <= arr[mid]) {
            if(arr[s] <= target && arr[mid] >= target){
                return s(arr, target, s, mid-1);
            } else {
                return s(arr, target, mid+1, e);
            }
        }
        if(arr[mid] <= target && arr[e] >= target){
            return s(arr, target, mid+1, e);
        } 
        return s(arr, target, s, mid-1);
    }
}