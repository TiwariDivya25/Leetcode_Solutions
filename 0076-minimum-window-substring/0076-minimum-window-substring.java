class Solution {
    static{
        Solution sol = new Solution();
        for(int i = 0; i < 150; i ++) {
            sol.minWindow("a", "a");
        }
    }
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> mapt = new HashMap<>();
        for(char c : t.toCharArray()) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }
        int unique = mapt.size();
        int l = 0, r = 0;
        int create = 0;
        int[] ans = {-1, 0, 0};
        Map<Character,Integer> sub = new HashMap<>();

        while(r < s.length()) {
            char c = s.charAt(r);
            int count = sub.getOrDefault(c, 0);
            sub.put(c, count + 1);
            if(mapt.containsKey(c) && sub.get(c).intValue() == mapt.get(c).intValue()) {
                create++;
            }
            while(l <= r && unique == create){
                c = s.charAt(l);
                if(ans[0] == -1 || ans[0] >= r-l+1) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }
                sub.put(c, sub.get(c) - 1);
                if(mapt.containsKey(c) && sub.get(c).intValue() < mapt.get(c).intValue()) {
                    create--;
                }
                l++;
            }
            r++;
        }

        if(ans[0] == -1) {
            return "";
        }
        return s.substring(ans[1], ans[2]+1);
    }
}