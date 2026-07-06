class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> 
            {if(b[0] == a[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        int ans = intervals.length;
        int prev = -1;
        for(int[] i : intervals) {
            if(i[1] <= prev) ans--;
            
            prev = Math.max(prev, i[1]);
            
        }
        return ans;
    }
}