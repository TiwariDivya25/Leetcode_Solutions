class Solution {
    private List<String> strs = new ArrayList<>();
    private String[] list = {"a", "b", "c"}; 
    public String getHappyString(int n, int k) {
        populate(n, "");
        if(k > strs.size()) return "";
        return strs.get(k-1);
    }
    private void populate(int n, String s) {
        if(s.length() == n) {
            strs.add(s);
            return;
        }
        for(int i = 0; i < 3; i++) {
            if(s.length() > 0 &&
            s.charAt(s.length() - 1) == list[i].charAt(0)) continue;
            populate(n, s+list[i]);
        }
    }
}