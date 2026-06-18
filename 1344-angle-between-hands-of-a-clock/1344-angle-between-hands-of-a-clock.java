class Solution {
    public double angleClock(int hours, int minutes) {
        double minAngle = minutes * 6;
        double hrAngle = (hours * 30) + minutes * 0.5;
        double diff = Math.abs(minAngle - hrAngle);
        return Math.min(diff, 360 - diff);
    }
}