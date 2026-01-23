class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0) {
            return 0;
        }
        if(s.length()==1){
            return 1;
        }

        int l = 0, r = 0;
        int sub = 0;
        int res = 0;

        Set<Character> set = new HashSet<>();

        while(r < s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(res, r-l+1);
            r++;
        }
        return res;
    }
}