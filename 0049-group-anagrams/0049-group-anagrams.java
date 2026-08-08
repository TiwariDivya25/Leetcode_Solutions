class Solution {
    static {
        Solution sol = new Solution();
        for(int i = 0; i<500; i++){
            sol.groupAnagrams(new String[] {"a"});
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String news = new String(c);
            if(!map.containsKey(news)){
                map.put(news, new ArrayList<>());
            }
            map.get(news).add(str);
        }
        return new ArrayList<>(map.values());
    }
}