class Solution {
    public int[] findDegrees(int[][] matrix) {
        int ans[] = new int[matrix.length];
        for(int i = 0; i<matrix.length; i++) {
            int c = 0;
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 1) c++;
            }
            ans[i] = c;
        }
        return ans;
    }
}