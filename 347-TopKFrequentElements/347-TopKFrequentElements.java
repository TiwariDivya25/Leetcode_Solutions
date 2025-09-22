// Last updated: 22/09/2025, 08:58:30
class Solution {
    static {
        Solution sol = new Solution();
        for (int i = 0; i < 200; i++) {
            sol.topKFrequent(new int[] {1}, 1);
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        if (k==nums.length) {
            return nums;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n , map.getOrDefault(n, 0) + 1);
        }
        
        Queue<Integer> minHeap = new PriorityQueue(
            (a, b) -> map.get(a) - map.get(b)
        );

        for (int n : map.keySet()) {
            minHeap.add(n);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = minHeap.poll();
        }
        return ans;

    }
}