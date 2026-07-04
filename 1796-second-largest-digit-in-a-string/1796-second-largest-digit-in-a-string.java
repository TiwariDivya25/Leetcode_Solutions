class Solution {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;
        
        for(char c : s.toCharArray()) { 
            if(c >= '0' && c <= '9') {
                int num = c - '0';
                if(num > first) {
                    second = first;
                    first = num;
                } else if(num < first && num > second) {
                    second = num;
                }
            }
        }
        return second;
        
    }
}