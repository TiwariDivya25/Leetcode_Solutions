class Solution {
    public int maxDistinct(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>(); 
        for(char c : s.toCharArray()) {
            if (!set.contains(c)){
                count++;
                set.add(c);
            }
        }
        return count;
    }
}