class Solution {
    public String reverseWords(String s) {
        if(s.isEmpty()) {
            return ""; 
        }
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int i = s.length(), j = s.length() - 1; 
        while(j >= 0) {
            if(j == 0) {
                sb = sb.append(s.substring(j, i));
            } else if (s.charAt(j) == ' ') {
                if(j+1 < i) {
                    sb = sb.append(s.substring(j + 1, i)).append(" ");
                }
                i = j;
            } 
            j--;
        }
        return sb.toString();
    }
}