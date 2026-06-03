class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landFin = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++) {
            landFin = Math.min(landFin, landStartTime[i] + landDuration[i]);
        }
        int waterFin = Integer.MAX_VALUE;
        for(int i = 0; i < waterStartTime.length; i++) {
            waterFin = Math.min(waterFin, waterStartTime[i] + waterDuration[i]);
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < waterStartTime.length; i++) {
            ans = Math.min(ans, Math.max(landFin, waterStartTime[i]) + waterDuration[i]);
        }
        for(int i = 0; i < landStartTime.length; i++) {
            ans = Math.min(ans, Math.max(waterFin, landStartTime[i]) + landDuration[i]);
        }
        return ans;
    }
}