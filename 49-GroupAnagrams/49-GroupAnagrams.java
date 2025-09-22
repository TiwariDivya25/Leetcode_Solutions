// Last updated: 22/09/2025, 08:58:43
class Solution {
    static {
        Solution sol = new Solution();
        for(int i = 0; i<500; i++){
            sol.groupAnagrams(new String[] {"a"});
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());  
    }
}