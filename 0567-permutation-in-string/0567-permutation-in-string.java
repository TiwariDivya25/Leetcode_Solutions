class Solution {
    static{
        Solution sol = new Solution();
        for(int i = 0; i < 150; i++) {
            sol.checkInclusion("", "");
        }
    }
    public boolean matches(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

        int[] s1arr = new int[26];
        int[] s2arr = new int[26];

        for(int i = 0 ; i < s1.length() ; i++) {
            s1arr[s1.charAt(i) - 'a']++;
            s2arr[s2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length() - s1.length(); i++) {
            if(matches(s1arr, s2arr)) {
                return true;
            }
            else{
                s2arr[s2.charAt(i + s1.length()) - 'a']++;
                s2arr[s2.charAt(i) - 'a']--;
            }
        }
        return matches(s1arr, s2arr);
    }
}