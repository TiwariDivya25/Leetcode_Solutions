class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int j = 0; j < queries.length; j++) {
            int count = 0;
            for(int i =0; i < points.length; i++) {
                if(Math.pow(queries[j][0]-points[i][0], 2)+Math.pow(queries[j][1]-points[i][1], 2)
                    <= Math.pow(queries[j][2], 2)) {
                        count++;
                    }
            }
            ans[j] = count;
        }
        return ans;
    }
}