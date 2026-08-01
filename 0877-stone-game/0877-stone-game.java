class Solution {
    public boolean stoneGame(int[] piles) {
        int s = 0;
        int e = piles.length-1;
        int p1 = 0;
        int p2 = 0;
        int turn = 1;
        while(s <= e) {
            if(turn % 2 == 1) {
                if(s <= e) {
                    p1+=piles[e];
                    e--;
                } else {
                    p1 += piles[s];
                    s++;
                }
            } else {
                if(s <= e) {
                    p2 += piles[e];
                    e--;
                } else {
                    p2 += piles[s];
                    s++;
                }
            }
        }
        if(p1 >= p2) return true;
        return false;
    }
}
