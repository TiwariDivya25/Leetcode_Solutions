class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int x = startPos[0], y = startPos[1];
        int[] ans = new int[s.length()];
        for(int z = 0; z < s.length(); z++) {
            int count = 0;
            x = startPos[0];
            y = startPos[1];
            for(int i = z; i < s.length(); i++) {
                if(s.charAt(i) == 'L') {
                    y--;
                } else if(s.charAt(i) == 'R') {
                    y++;
                } else if(s.charAt(i) == 'U') {
                    x--;
                } else if(s.charAt(i) == 'D') {
                    x++;
                } 
                if(x == n || y == n || x < 0 || y < 0) break;
                count++;
            }
            ans[z] = count;
        } 
        return ans;
    }
}