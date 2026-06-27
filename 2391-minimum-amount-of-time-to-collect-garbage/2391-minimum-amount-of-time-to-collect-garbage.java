class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0;
        ans += truck('M', garbage, travel);
        ans += truck('P', garbage, travel);
        ans += truck('G', garbage, travel);
        return ans;
    }
    private int truck(char type, String[] garbage, int[] travel) {
        int time = 0;
        int last = 0;
        
        for(int i = 0; i < garbage.length; i++) {
            String str = garbage[i];
            for(int j = 0; j < str.length(); j++) { 
                if(str.charAt(j) == type){
                    time++;
                    last = i;
                }
            }
        }
        for(int i = 0; i < last; i++) {
            time += travel[i];
        }
        return time;
    }
}